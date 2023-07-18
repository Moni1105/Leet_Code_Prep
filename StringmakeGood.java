class StringmakeGood {
    public String makeGood(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(sb.length()==0)
            {
                 sb.append(s.charAt(i));
            }
            else{

                if(Character.isUpperCase(sb.charAt(sb.length()-1))){
                    if((s.charAt(i)==Character.toLowerCase(sb.charAt(sb.length()-1)))){
                       sb.deleteCharAt(sb.length()-1);
                    }
                    else{
                    sb.append(s.charAt(i));
                }

                }else{
                    if(s.charAt(i)==Character.toUpperCase(sb.charAt(sb.length()-1))){
                      sb.deleteCharAt(sb.length()-1);
                    }
                    else{
                    sb.append(s.charAt(i));
                }

                }

            }
        }
     
      return sb.toString();  
    }
    public static void main(String args[]) {
        StringmakeGood as = new StringmakeGood();
        System.out.println(as.makeGood("Pp"));
      }
}
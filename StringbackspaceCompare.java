class StringbackspaceCompare {

  public boolean backspaceCompare(String s, String t) {
   
    String[] sarray= new String[2];
    sarray[0]=s;
    sarray[1]=t;
    int k=0;
    while(k<2){
         StringBuilder sb= new StringBuilder();
     for(int i=0;i<sarray[k].length();i++){

        if(sarray[k].charAt(i)=='#'&&sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }else {
            if(sarray[k].charAt(i)!='#')
            sb.append(sarray[k].charAt(i));
        }
    }
 
    sarray[k]=sb.toString();
       k++;
    }
    
return sarray[0].equals(sarray[1]);
  }

  public static void main(String args[]) {
    StringbackspaceCompare as = new StringbackspaceCompare();
    System.out.println(as.backspaceCompare("y#fo##f", "y#f#o##f"));
  }
}

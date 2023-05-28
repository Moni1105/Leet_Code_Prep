class StringRemoveAdjacentDuplicate {
    public String removeDuplicates(String s) {
        String S1="";
       /*  int i=1;
        while(i<s.length()-1)
        {
            if(s.charAt(i-1)!=s.charAt(i)){
                S1+=s.charAt(i-1)+s.charAt(i);
            }
            i=i+2;

        }*/

       /*  for(int i=1;i<=s.length()-1;i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                S1+=s.charAt(i);
            }
        }*/
       return S1; 
    }
    public static void main(String args[]){
        StringRemoveAdjacentDuplicate as = new StringRemoveAdjacentDuplicate();
    String res=as.removeDuplicates("aabbca");       
            System.out.println(res);
    }
}
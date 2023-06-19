class SlidingWindowKBeauty {
    public int divisorSubstrings(int num, int k) {
        String curreString="";
        int count =0;
        String s= String.valueOf(num);
        for(int i=0;i<s.length();i++){
            curreString+=s.charAt(i);
            if(i>=k-1){
                int div=Integer.parseInt(curreString);
                if(div!=0){
                if(num%div==0){
                    count++;
                }
            }
                curreString=curreString.substring(curreString.length()-k+1, curreString.length());

            }
        }
        return count;
    }
    public static void main(String args[]) {

        SlidingWindowKBeauty as= new SlidingWindowKBeauty();
        
       System.out.println(as.divisorSubstrings(240,2)) ;
    }
}
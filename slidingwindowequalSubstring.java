class slidingwindowequalSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxlength=0;
        int left=0;
        int changecost=0;
        for(int right=0;right<s.length();right++){
            changecost+=Math.abs(t.charAt(right)-s.charAt(right));
            while(changecost>maxCost){
                changecost-=Math.abs(t.charAt(left)-s.charAt(left));
            left++;}
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    public static void main(String args[]){
        slidingwindowequalSubstring as= new slidingwindowequalSubstring();
        System.out.println(as.equalSubstring("krrgw","zjxss",19));   
    }
}
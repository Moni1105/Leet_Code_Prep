class  reversePrefixWord{
    public String reversePrefix(String word, char ch) {
        char[] c= word.toCharArray();
        for(int i=0;i<word.length();i++){
        if(word.charAt(i) == ch){
            int left=0;
            int right=i;
            while(left<right){
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;right--;
            }
           break; 
        }
        
    }
    return new String(c);}
    public static void main(String[] args){
        reversePrefixWord rs = new reversePrefixWord();
     String res=rs.reversePrefix("xyxzxe",'z');
     System.out.print(res);    
    }
}

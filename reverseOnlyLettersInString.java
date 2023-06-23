class reverseOnlyLettersInString {
    public String reverseOnlyLetters(String s) {
      
        char[] ch= s.toCharArray();

          int  left=0;
        int right =ch.length-1;
        while(left<right){
            if(!Character.isLetter(s.charAt(left))){  
                left++;            
            }
            if(!Character.isLetter(s.charAt(right))){ 
                 right--;            
            }
            if(Character.isLetter(s.charAt(left))==true&& Character.isLetter(s.charAt(right))==true){
              char temp=ch[left];
              ch[left]=ch[right];
              ch[right]=temp;
              left++;
              right--;
            }
        }
        
        return new String(ch);
    }
    public static void main(String[] args){
        reverseOnlyLettersInString rs = new reverseOnlyLettersInString();
     String res=rs.reverseOnlyLetters("z<*zj");
     System.out.print(res);    
    }
}

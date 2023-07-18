import java.util.Stack;

class StringRemoveAdjacentDuplicate {
    public String removeDuplicates(String s) {
        Stack<Character> sk= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(sk.empty()){

                sk.push(s.charAt(i));
            }else{
                //char top=sk.peek();
                if(sk.peek()==s.charAt(i)){
                    sk.pop();
                }else{
                    sk.push(s.charAt(i));
                }
            }  
        }
       
        if(sk.empty()!=true)
        {
             StringBuilder sb=new StringBuilder();
          while(sk.empty()!=true){
            sb.append(sk.pop());
        }
        sb.reverse();
        return sb.toString();
        }
        
       return ""; 
    }
    public static void main(String args[]){
        StringRemoveAdjacentDuplicate as = new StringRemoveAdjacentDuplicate();
    String res=as.removeDuplicates("aabbca");       
            System.out.println(res);
    }
}
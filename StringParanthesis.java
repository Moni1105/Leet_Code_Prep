import java.util.*;

class StringParanthesis {
    public boolean isValid(String s) {
HashMap<Character,Character> hm= new HashMap<>();
Stack<Character> sk= new Stack<>();
hm.put('{','}');
hm.put('(',')');
hm.put('[',']');
for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
        sk.push(s.charAt(i));
    }else{
         char closingBracket=' ';
        if(sk.empty()!=true){
          closingBracket=sk.pop();
          closingBracket= hm.get(closingBracket);}
       if(s.charAt(i)!=closingBracket){
        return false;
       }
        }
        
    }

 return sk.empty()==true?true:false;

    }
    public static void main(String args[]){
        StringParanthesis as = new StringParanthesis();
    boolean res=as.isValid("]");       
            System.out.println(res);
    }
}
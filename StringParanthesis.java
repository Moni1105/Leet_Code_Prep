import java.util.*;

class StringParanthesis {
    public boolean isValid(String s) {
//HashMap<String,Integer> hm= new HashMap<String,Integer>();
int a=0;
int b=0;
int c=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                a+=1;
            }else if(s.charAt(i)=='}'){
                a-=1;
            } 
            if(s.charAt(i)=='['){
                b+=1;
            }else if(s.charAt(i)==']'){
                b-=1;
            } 
            if(s.charAt(i)=='('){
                c+=1;
            }else if(s.charAt(i)==')'){
                c-=1;
            } 

        }

        if (a==0 &&b==0&&c==0){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String args[]){
        StringParanthesis as = new StringParanthesis();
    boolean res=as.isValid("([)]");       
            System.out.println(res);
    }
}
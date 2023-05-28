import java.util.*;


class StringFizzBuzz {
    public List<String> fizzBuzz(int n) {
       List<String> ls= new ArrayList<String>();
       for(int i=0;i<n;i++){
        if((i+1)%3==0 && (i+1)%5==0){
            ls.add("FizzBuzz");
        }else if((i+1)%3==0){
            ls.add("Fizz");
        }else if((i+1)%5==0){
            ls.add("Buzz");
        }else{
            ls.add(String.valueOf(i+1));
        }
       }
       
       
       return ls;
    }

    public static void main(String args[]){
        StringFizzBuzz as = new StringFizzBuzz();
        List<String> res=as.fizzBuzz(15);  
        for(String s:res){
            System.out.println(s);
        }
    }
}
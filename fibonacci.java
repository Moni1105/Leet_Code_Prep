public class fibonacci {
    public int fib(int n)
    {
        if(n>=3)
        {
            return fib(n-1)+fib(n-2);
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        fibonacci fb = new fibonacci();
       System.out.println( fb.fib(7) );
    }
}

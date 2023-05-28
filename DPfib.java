import java.util.*;
class DPfib {
    private Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 0, 1, 1));
    public int fib(int n) {
//topdown approach using memoization
          // Creating a hash map with 0 -> 0 and 1 -> 1 pairs
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        cache.put(n, fib(n - 1) + fib(n - 2));
        return cache.get(n);
    

        //*********iterative Bottom up approach,instaed of using array and we can use variables to compute */
       /*  if(n<=1){
            return n;
        }
        int current=0;
        int prev1=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
  current= prev1+prev2;
  prev2=prev1;
  prev1=current;
        }
  return current;*/
     //************bottom up approach********************/
      /*   int[] a= new int[n+1];         
    int sum=0;
    if(n<=1){
        return n;
    }
    a[1]=1;
for(int i=2;i<=n;i++){
   a[i]=a[i-1]+a[i-2];
   sum=a[i]; 
}
return sum; */
   //********using recursion below******** */
   /* if(n==0){
        return 0;
    }else if(n==1 ||n==2){
        return 1;
    }
   return fib(n-1)+fib(n-2);   */ 
    }
    
    public static void main(String[] args) throws Exception{
        DPfib as= new DPfib();
       int res= as.fib(5); 
       System.out.println(res);
    }
}
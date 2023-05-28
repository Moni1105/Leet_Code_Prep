class DPClimbingStairs {
    public int climbStairs(int n) {
        
int a=1, b=1,current=0;
if(n<=1){
    return 1;
}

for(int i=2;i<=n;i++){
    current = b+a;
    a= b;
    b=current;
}

        return current;
        
    }
    public static void main(String[] args) throws Exception{
        DPClimbingStairs as= new DPClimbingStairs();
       int res= as.climbStairs(3); 
       System.out.println(res);
    }
}
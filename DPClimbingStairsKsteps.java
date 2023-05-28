class DPClimbingStairsKsteps {
    public int climbKStairs(int n,int k) {
        
int[] current=new int[n+1];
current[0]=1;
if(n<=1){
    return 1;
}
for(int i=1;i<=n;i++){
    for(int j=1;j<=k;j++){
    if(i-j<0){
        continue;
    }
  
        current[i]+=current[(i-j)] ;

    
}
}
        return current[n];
        
    }
    public static void main(String[] args) throws Exception{
        DPClimbingStairsKsteps as= new DPClimbingStairsKsteps();
       // boolean stairs[]= new boolean[]{false,true,false,true,true,false,false,false};
       int res= as.climbKStairs(7,3); 
       
       System.out.println(res);
    }
}
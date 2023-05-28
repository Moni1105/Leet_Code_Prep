class DPClimbingRedStairsKsteps {
    public int climbKwithRedStairs(int n,int k,boolean[] stairs) {
        
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
    if(stairs[i]==true){
        current[i]=0;
    }else{
        current[i]+=current[(i-j)] ;
    }    
}
}
        return current[n];
        
    }
    public static void main(String[] args) throws Exception{
        DPClimbingRedStairsKsteps as= new DPClimbingRedStairsKsteps();
        boolean stairs[]= new boolean[]{false,true,false,true,true,false,false,false};
       int res= as.climbKwithRedStairs(7,3,stairs); 
       
       System.out.println(res);
    }
}
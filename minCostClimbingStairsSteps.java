class minCostClimbingStairsSteps {
    public int minCostClimbingStairs(int[] cost) {
        int minimumCost[] = new int[cost.length + 1];
        
        // Start iteration from step 2, since the minimum cost of reaching
        // step 0 and step 1 is 0
        for (int i = 2; i < minimumCost.length; i++) {
            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
            int takeTwoSteps = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(takeOneStep, takeTwoSteps);
        }
        
        // The final element in minimumCost refers to the top floor
        return minimumCost[minimumCost.length - 1];
    }    
    public static void main(String[] args) throws Exception{
        minCostClimbingStairsSteps as= new minCostClimbingStairsSteps();
       int cost[]= new int[]{1,100,1,1,1,100,1,1,100,1};
       int res= as.minCostClimbingStairs(cost); 
       
       System.out.println(res);
    }
}
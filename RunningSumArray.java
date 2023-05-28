class RunningSumArray {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
       return nums; 
    }

    public static void main(String args[]){
        RunningSumArray as= new RunningSumArray();
        int[] mat = new int[]{1,2,3,4};
        int[] res=as.runningSum(mat);
        for(int n:res){
        System.out.println(n);
        }
}
}
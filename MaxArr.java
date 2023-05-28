class MaxArr {
    public int maxSubArray(int[] nums) {
        int Max=Integer.MIN_VALUE;
        int count =0;

        for(int i=0;i<nums.length;i++){
            if(nums.length>1){
            count=nums[i];
            Max=Math.max(Max,count);
            for(int j=i+1;j<nums.length;j++){  
                count+=nums[j];
                Max=Math.max(Max,count);

            }
           
        }
        else{
            Max=nums[0];
        }
        }
        return Max;
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        MaxArr  as = new MaxArr();
        int[] arr=new int[]{-1,-2};
        int res=as.maxSubArray(arr);
       System.out.println(res);
    }
}
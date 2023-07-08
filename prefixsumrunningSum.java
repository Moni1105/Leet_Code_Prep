class prefixsumrunningSum {
    public int[] runningSum(int[] nums) {
        int[] prefix= new int[nums.length+1];
        prefix[0]=0;
        for(int i=1;i<=nums.length;i++){
            prefix[i]=nums[i-1]+prefix[i-1];
        }
       return prefix; 
    }
    public static void main(String args[]){
        prefixsumrunningSum as= new prefixsumrunningSum();
        int[] nums= new int[]{1,1,1,1,1};
        int[] res=as.runningSum(nums);
        for(int r:res)
        System.out.print(r);
    }

}
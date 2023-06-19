class SlidingWindowflip2ones {
    public int longestOnes(int[] nums, int k) {
        int curr=0;
        int ans=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
            curr++;}
            while(curr>k){
                if(nums[left]==0){
                    curr--;
                }
                left++;

            }
            ans=Math.max(ans,right-left+1);
        }
    return ans;    
    }
    public static void main(String args[]){
        SlidingWindowflip2ones as= new SlidingWindowflip2ones();
        int[] nums= new int[]{1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(as.longestOnes(nums,2));   
    }
}
class slidingwindowminSubArrayLen{
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int currentsubarray=0;
        int min=Integer.MAX_VALUE;
        boolean flag=true;
        for(int right=0;right<nums.length;right++){
            currentsubarray+=nums[right];
            while(currentsubarray>=target){
                flag=false;
                min=Math.min(min,right-left+1);
                currentsubarray-=nums[left];
                left++;
            }

        }
        if(flag==false){
            return min;
        }else{
              return 0;
        }
        
    }
    public static void main(String args[]){
        slidingwindowminSubArrayLen as= new slidingwindowminSubArrayLen();
        int[] nums= new int[]{2,3,1,2,4,3};
        System.out.println(as.minSubArrayLen(7,nums));   
    }
}
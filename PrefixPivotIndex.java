class PrefixPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] prefix= new int[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=1;i<prefix.length;i++){
            int left=prefix[i-1];
            int right=prefix[prefix.length-1]-prefix[i];
            if(left==right){
                return i-1;
            }
        }
          return -1;
        
    }
    public static void main(String args[]){
        PrefixPivotIndex as= new PrefixPivotIndex();
        int[] nums= new int[]{1,7,3,6,5,6};
        System.out.println(as.pivotIndex(nums));   
    }
}
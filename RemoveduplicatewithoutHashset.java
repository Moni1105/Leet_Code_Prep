class RemoveduplicatewithoutHashset {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];     
                insertIndex++;
            }
        }
        return insertIndex;
    }


    public static void main(String args[]){
        RemoveduplicatewithoutHashset as= new RemoveduplicatewithoutHashset();
        int[] arr= new int[]{0,0,1,1,1,2,2,3,3,4};
              int res=as.removeDuplicates(arr);
        System.out.println(res);
    

    }
}
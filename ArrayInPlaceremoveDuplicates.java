class ArrayInPlaceremoveDuplicates
{
    public int removeDuplicates(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int insertIndex=1;
    
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[insertIndex]=nums[i];
                insertIndex++;
            }
            
        }
        return insertIndex;

        
    }
    public static void main(String args[]){
        ArrayInPlaceremoveDuplicates as= new ArrayInPlaceremoveDuplicates();
        int[] arr= new int[]{1,2,2,3,4,4,5};
       System.out.print( as.removeDuplicates(arr));

    }
   /* 1223445
    ii=1,i=1
    nums[ii]= nums[i]-- 1,2
    ii=2,i=2
    ii=2,i=3
    nums[ii]=nums[i]--1,2,3
    ii=3,i=4
    nums[ii]=nums[i]--1,2,3,4
    ii=4,i=5
    ii=4,i=6
    nums[ii]=nums[i]--1,2,3,4,5
    ii=5*/



   
}
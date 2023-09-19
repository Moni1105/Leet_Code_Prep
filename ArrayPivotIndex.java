class ArrayPivotIndex {
    public int pivotIndex(int[] nums) {
      
        int[] prefix= new int[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]= nums[i]+prefix[i];
        }

         for(int i=0;i<nums.length;i++){
            if(prefix[i]==prefix[prefix.length-1]-prefix[i+1]){
                return i;
            }
           

         }
         return -1;
        
    }
    public static void main (String args[]){
        ArrayPivotIndex as= new ArrayPivotIndex();
        int[] n= new int[]{1,7,3,6,5,6};
       System.out.println(as.pivotIndex(n));

    }
}
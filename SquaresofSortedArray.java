class SquaresofSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res= new int[nums.length];
        int left=0,right=nums.length-1,i=0;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[nums.length-1-i]=nums[left]*nums[left];
                left=left+1;
            }else{
                 res[nums.length-1-i]=nums[right]*nums[right];
                 right=right-1;
            }
            i++;
        }
         
          
          return res;
      }
    public static void main(String args[]){
        SquaresofSortedArray as= new SquaresofSortedArray();
        int[] mat = new int[]{-4,-1,0,3,10};
        int res[]=as.sortedSquares(mat);
        for(int n:res)
        System.out.println(n);
    
}
}
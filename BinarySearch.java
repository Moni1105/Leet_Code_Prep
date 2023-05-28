class BinarySearch {
    public int search(int[] nums, int target) {
       int left =0;
       int right=nums.length-1;
while(left<=right){
     
    if(nums[left]==target){
       return left;
    }else if(nums[right]== target){
        return right;
    }else {
      int mid= (left+right)/2;
      if(nums[mid]==target){
        return mid;
      }else if(target>nums[mid]){
        left=mid+1;
      }else if(target<nums[mid]){
        right=mid-1;
      }

    }

}   return -1; 
    }

    public static void main(String args[]){
        BinarySearch as= new BinarySearch();
        int[] mat = new int[]{10,20,30,40,50,60,70,80,90,100};
        int res=as.search(mat,80);
        System.out.println(res);
    
}
}
class BinarySearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int res=-1;

        while(left<right){
            if(nums[left]==target){
                res=left;
                break;

            }else if(nums[right]==target){
                res= right;
                break;
            }else{
               int mid= left+(right-left)/2;
               if(nums[mid]==target){
                   res= mid;
                   break;
               }else if(nums[mid]<target){
                   left=mid+1;
               }else if(nums[mid]>target){
                   right=mid-1;
               }
            }
        }

        if(res==-1){

            if(right>=0){
            if(target==nums[left]){
            res=left;
        }else if(target<nums[right]){
            res=right;}
            else{
              res=right+1;
               }
        }
    else{
        res=0;
    }
}

        return res;
    }

    public static void main(String args[]){
        BinarySearchInsert as= new BinarySearchInsert();
        int[] mat = new int[]{10,30};//,20,30,40,50,60,70,80,90,100
        int res=as.searchInsert(mat,0);
        System.out.println(res);
    
}
}
class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int a= 430043%43;
        for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
             if(nums[i]==nums[j]){
                if(!(Math.abs(i-j)<=k))
                return false;
             }
        }
    }
    return true;
    }
    public static void main(String args[]) {

        ContainsDuplicate2 as= new ContainsDuplicate2();
        int[] nums= new int[]{1,0,1,1};
       System.out.println(as.containsNearbyDuplicate(nums,1)) ;
    }
}
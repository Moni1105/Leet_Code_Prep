class NumArray {
    private int[] value;
    public NumArray(int[] nums) {
        value= nums;
        
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        while(left<=right){
            sum+=value[left];
            left++;
        }
       return sum; 
    }
    public static void main(String args[]){
        int[] nums= new int[]{-2, 0, 3, -5, 2, -1};
        NumArray as= new NumArray(nums);
        
        System.out.println(as.sumRange(0,2));   
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
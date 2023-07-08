class HashMapsumOfUnique {
    public int sumOfUnique(int[] nums) {
        int plus = 0;
        int minus = 0;

        int[] list = new int[101];
        for(int a : nums){
            plus += a;
            list[a] ++;
            if(list[a]>2) minus += a;
            else if(list[a]==2) minus += a*2;
        }
        return plus-minus;
    }
    public static void main(String args[]){
        HashMapsumOfUnique as= new HashMapsumOfUnique();
        int[] nums= new int[]{1,2,3,2,2};
        System.out.println(as.sumOfUnique(nums));
    }
}
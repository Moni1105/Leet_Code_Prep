class prefixsumMinStartValue {
    public int minStartValue(int[] nums) {
        // Start with startValue = 1. 
        int startValue = 1;


        while (true) {
            int total = startValue;
            boolean isValid = true;      
            for (int num : nums) {             
                total += num;               
                if (total < 1) {
                    isValid = false;
                    break;
                }
            }         
            if (isValid) {
                return startValue;
            } else {
                startValue += 1;
            }
        }
    }
    public static void main(String args[]){
        prefixsumMinStartValue as= new prefixsumMinStartValue();
        int[] nums=new int[]{1,-2,-3};
        System.out.println(as.minStartValue(nums));
    }
}
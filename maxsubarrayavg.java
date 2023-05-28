class maxsubarrayavg {
    public double findMaxAverage(int[] nums, int k) {
        double count=0;
        double avg=0;
        double max=Integer.MIN_VALUE;
    
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
            if(i>=k-1){
                avg=count/k;
                max=Math.max(max,avg);
                count-=nums[i-(k-1)];
            }     
        }

        return max;
    }
    public static void main(String args[]){
        maxsubarrayavg as= new maxsubarrayavg();
        int[] arr= new int[]{-1,2,4,5,6,7};
        double res=as.findMaxAverage(arr,4);
        System.out.println(res);
    
    }
}
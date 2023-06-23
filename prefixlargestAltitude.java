import java.util.*;
class prefixlargestAltitude {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
       int sum=0;
        max=Math.max(max,sum);
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
             max=Math.max(max,sum);
        }
        
        return max;
        
    }
    public static void main(String args[]){
        prefixlargestAltitude as= new prefixlargestAltitude();
        int[] nums= new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(as.largestAltitude(nums));   
    }
}
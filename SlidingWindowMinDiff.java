import java.util.*;


class SlidingWindowMinDiff {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int diff=0;
      if(nums.length<=1){
        return 0;
      }
        
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> arr= new ArrayList<Integer>();    
            arr.add(nums[i]);
        for(int j=i+1;j<nums.length;j++){
            arr.add(nums[j]);            
                  if(arr.size()>=k){
                  Collections.sort(arr);
                 diff= arr.get(arr.size()-1)-arr.get(0);
                   min=Math.min(diff, min);
                  arr.clear();
                  arr.add(nums[i]);}            
        }
    }
     return min;   
    }

    public static void main(String args[]) {

        SlidingWindowMinDiff as= new SlidingWindowMinDiff();
        int[] nums=new int[]{93614,91956,83384,14321,29824,89095,96047,25770,39895};
       System.out.println(as.minimumDifference(nums,3)) ;
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;
class findMaxOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
                max=Math.max(sum,max);
            }
            else{
                sum=0;
            }
        }
       return max; 
    }
}
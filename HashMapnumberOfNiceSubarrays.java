
/* Input: nums = [1,1,2,1,1], k = 3   
curr=1 - ans==0, counts=1,1
2-ans=0,counts=(1,1),(2,1)
2- ans=0,counts=(1,1),,(2,2)
3- ans=3-3=0=>1, counts(1,1),,(2,1),(3,1)
4- ans=4-3=1>2,
    
    







} */

import java.util.*;
class HashMapnumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
         Map<Integer,Integer> counts= new HashMap<>();
        counts.put(0,1);
        int curr=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i]%2;
            ans+= counts.getOrDefault(curr-k,0);
            counts.put(curr,counts.getOrDefault(curr,0)+1);
        }
        return ans;
    }
    public static void main(String args[]){
        HashMapnumberOfNiceSubarrays as= new HashMapnumberOfNiceSubarrays();
        int[] nums= new int[]{1,0,1,0,1};
        System.out.println(as.numberOfSubarrays(nums,3));
    }
}
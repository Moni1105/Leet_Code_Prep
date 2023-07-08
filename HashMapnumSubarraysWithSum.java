//1,0,1,0,1-array

//counts-to store prefix sum and frequency
//why frequency -- if negative numbers in array ,same prefix will appear many times
//curr- to store sum of subarray so far
//ans - to update how many number of subarray with given constrain
//how to update answer--> if curr -k is present in counts then curr-(curr-k)=k

/* how it works
 * 1- curr=1, curr-k= 1-2=-1 is not in count , ans=0;,update count 1,1
 * 10-curr=1,curr-k=1-2=-1 is not in count ,ans=0,,update count(1,2)
 * 101- curr=2,curr-k=0,0 is present in count, ans=1;update count(2,1)(1,2)
 * 1010=curr=2,",","," ans=2,update count (2,2)(1,2)
 * 10101=curr=3,curr-k=1,ans=2+2=4,update count(3,1)(2,2)(1,2)
 * 
 */
import java.util.*;
class HashMapnumSubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int curr=0;
       int ans=0;
       Map<Integer,Integer> counts= new HashMap<>();
       counts.put(0,1);
       for(int i=0;i<nums.length;i++){
        curr+=nums[i];
        if(counts.containsKey(curr-goal)){
            ans+=counts.get(curr-goal);
        }
        counts.put(curr,counts.getOrDefault(curr,0)+1);
       }
       return ans;
    }
    public static void main(String args[]){
        HashMapnumSubarraysWithSum as= new HashMapnumSubarraysWithSum();
        int[] nums= new int[]{1,0,1,0,1};
        System.out.println(as.numSubarraysWithSum(nums,2));
    }
}

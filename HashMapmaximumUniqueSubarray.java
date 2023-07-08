import java.util.*;
class HashMapmaximumUniqueSubarray{
    public int maximumUniqueSubarray(int[] nums) {
        int[] prefix= new int[nums.length];
        prefix[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int curr=0;
        int max=0;
        Map<Integer,Integer> hmap= new HashMap<>();
        for(int i=0,left=0;i<nums.length;i++){
            curr+=nums[i];
            if(hmap.containsKey(nums[i])){
                curr-=prefix[hmap.get(nums[i])];
                int t=hmap.get(nums[i]);
                while(left<=t){
                    if(hmap.containsKey(nums[left])){
                        hmap.remove(nums[left]);
                        left++;
                    }
                }
            }
            max= Math.max(max,curr);
            hmap.put(nums[i],i);
        }
        return max;
    }
    public static void main(String args[]){
        HashMapmaximumUniqueSubarray as= new HashMapmaximumUniqueSubarray();
        int[] nums= new int[]{187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        System.out.println(as.maximumUniqueSubarray(nums));
    }
}

/**********
 * 4,2,4,5,6
 * 4 - is not present in hmap ,curr=4,max=4,hmap= 4,0
 * 2-is not present, curr=6,max=6,hmap= (4,0),(2,1)
 * 4- is present, curr=10,curr-4 update (4,2),max=6,hmap=(4,2),(2,1)
 * 5-not,curr-11,max=11,hmap(5,1),(4,2),(2,1)
 * 6-not
 * 
 * 
 * 
 * 
 * hashmap- number and index
 * if number present in hashmap- get its 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
class HashMapnumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        Map<Integer,Integer> hmap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                count+=hmap.get(nums[i]);
            }
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
      return count;  
    }
    public static void main(String args[]){
        HashMapnumIdenticalPairs as= new HashMapnumIdenticalPairs();
        int[] nums= new int[]{1,1,4,1};
        System.out.println(as.numIdenticalPairs(nums));
    }
}
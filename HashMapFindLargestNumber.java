import java.util.*;
class HashMapFindLargestNumber {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer,Integer> hmap=new HashMap<>();
        int max=-1;

        for(int n:nums){
            hmap.put(n,hmap.getOrDefault(n,0)+1);
           
        }
        for(int x:hmap.keySet()){
            if(hmap.get(x)==1){
                max=Math.max(x,max);
            }
        }
        return max;
        
    }
    public static void main(String args[]){
        HashMapFindLargestNumber as= new HashMapFindLargestNumber();
        int[] nums= new int[]{11,10,11};
        System.out.println(as.largestUniqueNumber(nums));
    }
}
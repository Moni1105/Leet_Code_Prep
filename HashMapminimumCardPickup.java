import java.util.*;
class HashMapminimumCardPickup {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> hm=new HashMap<Integer,Integer>();
        int min=Integer.MAX_VALUE;
        /*
         * adding key as cards[i] and value as its index i in hashmap
         * if key is present in hashmap, get the length of subarray
         * to find subarray length- (i+1)- current pointer - previous pointer of the element in array which we store in hashmap as value for each key
         */
        for(int i=0;i<cards.length;i++)
        {
            if(hm.containsKey(cards[i]))
            {
                min=Math.min(min,(i+1)-hm.get(cards[i]));
            }
            hm.put(cards[i],i);
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
    public static void main(String args[]){
        HashMapminimumCardPickup as= new HashMapminimumCardPickup();
        int[] nums= new int[]{3,3,2,7};
        System.out.println(as.minimumCardPickup(nums));
    }
}
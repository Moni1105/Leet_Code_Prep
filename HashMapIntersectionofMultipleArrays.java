import java.util.*;
class HashMapIntersectionofMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> al= new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int[] arr:nums){
            for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);}
        }
        for(int k:hm.keySet()){
            if(hm.get(k)==nums.length){
                al.add(k);
            }
        }

      Collections.sort(al); 
      return al;
    }
    public static void main(String args[]){
        HashMapIntersectionofMultipleArrays as= new HashMapIntersectionofMultipleArrays();
        int[][] nums= new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(as.intersection(nums));
    }
}
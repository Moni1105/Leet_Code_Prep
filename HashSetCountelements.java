import java.util.*;
class HashSetCountelements {
    public int countElements(int[] arr) {
        Set<Integer> hs= new HashSet<>();
        int count=0;
        for(int num:arr){
            
            hs.add(num);

        }
        
        for(int num:arr){
            if(hs.contains(num+1)){
               count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        HashSetCountelements as= new HashSetCountelements();
        int[] nums= new int[]{0,1,2,3};
        System.out.println(as.countElements(nums));
    }
}
import java.util.*;
class HashMapmaximumSum {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<>();
        int Max=-1;
        for(int num:nums){
            String ch= Integer.toString(num);

                int sod=0;
                int len=ch.length();
                while(len>=1){
                    sod+=Character.getNumericValue(ch.charAt(len-1));
                    len--;
                }
 
            if(hm.containsKey(sod)){
                Max=Math.max(Max,hm.get(sod)+num);
            }
            //hm.get(sod).add(num);  
            hm.put(sod,Math.max(hm.getOrDefault(sod,0),num));
        
        }
            
            return Max;
        
    }
    public static void main(String args[]){
        HashMapmaximumSum as= new HashMapmaximumSum();
        int[] nums= new int[]{18,43,36,13,7};
        System.out.println(as.maximumSum(nums));
    }
}

/* 
another way to find max in every key of hashmap
            for(int key:hm.keySet()){
                List<Integer> arr= hm.get(key);
                if(arr.size()>1){
                    Collections.sort(arr, Collections.reverseOrder());
                        Max=Math.max(Max,arr.get(0)+arr.get(1));
                }



            }*/

            /*********** to calculate sum of digits in an Integer */
          /*   public int getDigitSum(int num) {
                int digitSum = 0;
                while (num > 0) {
                    digitSum += num % 10;
                    num /= 10;
                }
                
                return digitSum;
            }*/
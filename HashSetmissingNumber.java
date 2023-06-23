import java.util.*;
class HashSetmissingNumber {
    public int missingNumber(int[] nums) {
        int res=0;
        int n=nums.length;
        Set<Integer> hs= new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int i=0;i<=n;i++)
        {
            if(!hs.contains(i)){
                res= i;
                break;
            }
        }
        return res;
    }
    public static void main(String args[]){
        HashSetmissingNumber as= new HashSetmissingNumber();
        int[] nums= new int[]{0,1};
        System.out.println(as.missingNumber(nums));
    }
}
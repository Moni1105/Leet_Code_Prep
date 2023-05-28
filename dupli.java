import java.util.*;
import java.lang.*;
import java.io.*;
class dupli {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        dupli  as = new dupli();
        int[] arr=new int[]{0};
        boolean res=as.containsDuplicate(arr);
       System.out.println(res);
    }
}
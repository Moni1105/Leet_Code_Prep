import java.util.*;
import java.lang.*;
import java.io.*;

class Mergearray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // int[] nums1= new int[m+n];
       // System.arraycopy(nums1, 0, newarr, 0, m);
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        for(int x:nums1)
        {
            System.out.println(x);
        }
        
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        Mergearray  as = new Mergearray();
        int[] arr=new int[]{-1,-2,4,5,7};
        int[] arr1=new int[]{-1,-2};
        as.merge(arr,3,arr1,2);
       
    }
}
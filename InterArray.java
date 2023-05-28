import java.util.*;
import java.lang.*;
import java.io.*;
class InterArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        InterArray  as = new InterArray();
        int[] arr=new int[]{1,2,2,1};
        int[] arr1=new int[]{2,2};
       int[] arr2=as.intersect(arr,arr1); //new int[arr.length+arr1.length];
       for(int n1:arr2){
       System.out.println(n1);
       }
    }
}
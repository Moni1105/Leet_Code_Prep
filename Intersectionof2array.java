import java.util.*;
class Intersectionof2array {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int[] arr = new int[nums1.length+nums2.length];
         
        int k=0;
        for(int i=0;i<nums1.length;i++){
            if(i>0){
                if(nums1[i-1]==nums1[i]){
                    continue;
                }
            }
            for(int j=0;j<nums2.length;j++){
                if(j>0){
                    if(nums2[j-1]==nums2[j]){
                        continue;
                    }
                }
                if(nums1[i]==nums2[j])
                {
                 arr[k]=nums1[i];
                 k++;
                }
            }
        }

        return Arrays.copyOfRange(arr,0,k);
        
    }


    public static void main(String[] args)throws java.lang.Exception 
    {
        Intersectionof2array  as = new Intersectionof2array();
        int[] arr1= new int[]{2,2,2,2,1,1,1};
        int[] arr2= new int[]{2,2,2};

        int[] res=as.intersection(arr1,arr2);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
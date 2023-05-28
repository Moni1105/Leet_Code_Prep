import java.util.*;
import java.lang.*;
import java.io.*;
class combine2 {

        public int minNumber(int[] nums1, int[] nums2) {
       String result=null;
       boolean flag=true;
        Arrays.sort(nums1);
           Arrays.sort(nums2);
   
       for(int i=0;i<nums1.length;i++)
       {
           for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j])
               {
                flag= false;
   result=Integer.toString(nums1[i]);
break;
               }
              
           } if(!flag) break;
       }
   
       if(flag==true){
   result= Integer.toString(nums1[0])+Integer.toString(nums2[0]);
          
       }

           return Integer.parseInt(result);
       }
   

   public static void main(String[] args)throws java.lang.Exception 
{
    combine2  as = new combine2();
    int[] arr=new int[]{6,4,3,7,2,1,8,5};
    int[] arr1=new int[]{6,8,5,3,1,7,4,2};
    int res=as.minNumber(arr,arr1);
    System.out.println(res);
    
}
}
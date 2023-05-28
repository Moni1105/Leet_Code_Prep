import java.util.*;
import java.lang.*;
import java.io.*;
class AP {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
int res= Math.abs(arr[0]-arr[1]);
        for(int i=arr.length-1;i>=1;i--){
            if(res!=Math.abs(arr[i]-arr[i-1]))
            {              
                return false;
                     }
    
        }
      return true; 
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        AP  as = new AP();
        int[] arr=new int[]{1,3,5};
        boolean res=as.canMakeArithmeticProgression(arr);
       System.out.println(res);
    }
}
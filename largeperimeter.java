import java.util.*;
import java.lang.*;
import java.io.*;
public class largeperimeter {
    // you need to treat n as an unsigned value
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; --i)
            if (A[i] + A[i+1] > A[i+2])
                return A[i] + A[i+1] + A[i+2];
        return 0;
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        largeperimeter  as = new largeperimeter();
        int[] arr=new int[]{1,2,3,4};
        int res=as.largestPerimeter(arr);
       System.out.println(res);
    }
}
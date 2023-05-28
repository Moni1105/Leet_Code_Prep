import java.util.*;

public class SortingBinary {

        public static int[] sortByBits(int[] arr) {
int n =arr.length;
            int[][] newarr= new int[n][2];
Arrays.sort(arr);
for(int i=0;i<arr.length;i++){
    newarr[i][0]=Integer.bitCount(arr[i]);
    newarr[i][1]=arr[i];

}
  // Sort in increasing order of number of 1 bits
        // if number of 1 bits is same,
        // sort in increasing order of the element itself
Arrays.sort(newarr, (x, y) ->
(x[0] == y[0])? (x[1] - y[1]) : (x[0] - y[0])
);
          for(int i=0;i<n;i++)
          {
            arr[i]=newarr[i][1];
          }
          return arr;
        }

       
    
    public static void main(String[] args)throws java.lang.Exception 
    {
        SortingBinary  as = new SortingBinary();
        int[] arr= new int[]{1024,512,256,128,64,32,16,8,4,2,1};
        int[] res=as.sortByBits(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
}
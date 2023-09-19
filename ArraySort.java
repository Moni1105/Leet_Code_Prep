import java.util.Random;
public class ArraySort {
    public int[] sortSingleloop(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                int temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        return arr;
    }
    public static void main (String args[]){
        Random rand = new Random();
        ArraySort as= new ArraySort();
        int[] n= new int[50];
        for(int i =0;i<n.length;i++)
        {
            n[i]=rand.nextInt(50);
        }

      int[] res= as.sortSingleloop(n);
       for(int a:res){
        System.out.println(a);
       }

    }
    
}

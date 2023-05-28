
import java.util.*;
import java.lang.*;
public class Sorting2dArray{
/******2d array we cant use directly to sort */
    public int[][] sort2darray(int arr[][]){
        int[] temp = new int[arr.length*arr[0].length];
int m=0;
int n=0;
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length;j++){
  temp[m]=arr[k][j];
  m++;
            }
     
           }
           Arrays.sort(temp);

           for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length;j++){
  arr[k][j]=temp[n];
  n++;
            }
     
           } 
         
return arr;
    }

    public int[][]  sortEfficientMemory(int[][] data)
    {
  //space complexity-O(1), time- O(row*col)

        // Number of elements in matrix
        int row=data.length ;
        int col=data[0].length;
        int size =row *col ;
  
        // Loop to sort the matrix
        // using Bubble Sort
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size - 1; j++) 
            {
  
                // Condition to check
                // if the Adjacent elements

                System.out.println((j / col)+" and "+(j % col) );
                if (data[j / col][j % col] > data[(j + 1) 
                    / col][(j + 1) % col])
                {
  
                    // Swap if previous value is greater
                    int temp = data[j / col][j % col];
                    data[j / col][j % col] = data[(j + 1) 
                        / col][(j + 1) % col];
                    data[(j + 1) / col][(j + 1) % col] = temp;
                }
            }
        }

        return data;
    }
  














    public int[][] rowwisesorting2darray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
        return arr;
    }

   public int[][] columnWisesorting2darray(int arr[][]){
    
            Arrays.sort(arr, new Comparator<int[]>(){
                public int compare(int[] i1,int[] i2){
                    if(i1[3]>i2[3]){
                        return 1;
                    }else{
                        return -1;
                    }
                }

            });
    return arr;
    }

    public static void main(String args[]) throws java.lang.Exception{
        int[][] arr= new int[][]{{3,4,1,10},{5,2,65,89},{7,6,32,5},{104,107,100,101}};
        Sorting2dArray as= new Sorting2dArray();
     int[][] sortarr=   as.sortEfficientMemory(arr);
     // int[][] sortrowarr= as.rowwisesorting2darray(arr);
      // int[][] sortcolumarr= as.columnWisesorting2darray(arr);

       for(int k=0;k<sortarr.length;k++){
        for(int j=0;j<sortarr[k].length;j++){
System.out.print(sortarr[k][j]+" ");
        }
        System.out.println();
       }

    }
}
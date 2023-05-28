public class MatrixArrayPrintProblems {

public void printMatrix(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
              
                
             System.out.print(arr[row][col]+" ");
            
        }
        
            System.out.println();
           
        }

    }
    public void printFirstandrow(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(row ==0 || col== 0){
                
             System.out.print(arr[row][col]+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        
            System.out.println();
           
        }

    }

    public void printBorderElements(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(row ==0 || row== arr.length-1 || col==0|| col== arr[0].length-1){
                
             System.out.print(arr[row][col]+" ");
            }else{
                System.out.print("  ");
            }
        }
        
            System.out.println();
           
        }

    }
    public void printdiagonalElements(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(row ==col || row+col==arr.length-1){
                
             System.out.print(arr[row][col]+" ");
            }else{
                System.out.print("  ");
            }
        }
        
            System.out.println();
           
        }

    }
    public void printlowerdiagonalElements(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(row >=col){
                
             System.out.print(arr[row][col]+" ");
            }else{
                System.out.print("  ");
            }
        }
        
            System.out.println();
           
        }

    }
    public void printupperdiagonalElements(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(col >=row){
                
             System.out.print(arr[row][col]+" ");
            }else{
                System.out.print("  ");
            }
        }
        
            System.out.println();
           
        }

    }



    public static void main(String args[]) throws java.lang.Exception{
        int[][] arr= new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        MatrixArrayPrintProblems as= new MatrixArrayPrintProblems();
 as.printMatrix(arr);
     as.printFirstandrow(arr);
     as.printBorderElements(arr);
     as.printdiagonalElements(arr);
     as.printlowerdiagonalElements(arr);
     as.printupperdiagonalElements(arr);
     

      

    }
    
}

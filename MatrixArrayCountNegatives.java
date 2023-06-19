class MatrixArrayCountNegatives {
    public int countNegatives(int[][] grid) {
        /*brute force algorithm */
       /*  int count =0;
        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]<0){
                   count++;
                }else{
                    break;
                }
            }
        }
      return count;  */
      int count = 0;
      int n = grid[0].length;
      // Iterate on all rows of the matrix one by one.
      for (int[] row : grid) {
          // Using binary search find the index
          // which has the first negative element.
          int left = 0, right = n - 1;
          while (left <= right) {
              int mid = (right + left) / 2;
              if (row[mid] < 0) {
                  right = mid - 1;
              } else {
                  left = mid + 1;  
              }
          }
          // 'left' points to the first negative element,
          // which means 'n - left' is the number of all negative elements.
          count += (n - left);
      }
      return count;
    }
    public static void main(String args[]) throws java.lang.Exception{
        int[][] arr= new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        MatrixArrayCountNegatives as= new MatrixArrayCountNegatives();
 System.out.println(as.countNegatives(arr));
    }
}
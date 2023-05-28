class MatrixDiagonal {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++){

                if(i==j||((i+j==mat.length-1)&&(i!=j))){
                  sum+=mat[i][j];
                }
            }
        }

        return sum;
        
    }

    public static void main(String args[]){
        MatrixDiagonal as= new MatrixDiagonal();
        int[][] mat = new int[][]{{1,2,3},
            {4,5,6},
            {7,8,9}};

        int res=as.diagonalSum(mat);
        System.out.println(res);

}
}
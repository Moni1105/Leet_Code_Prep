public class Pattern {
    public void rectangularPattern(int n){
     
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        System.out.print('*');
     }
     System.out.println();
    }
}

public void rightAngleTrianglePattern(int n){
     
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
        System.out.print('*');
     }
     System.out.println();
    }
}
public void rightAngleNumberPattern(int n){
     
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print(j);
     }
     System.out.println();
    }
}
public void rightAngleSameNumberPattern(int n){
     
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print(i);
     }
     System.out.println();
    }
}
public void invertedRightAngleTrianglePattern(int n){
   
    for(int i=0;i<n;i++){
       for(int j=n;j>i;j--){
        System.out.print('*');
       }
       System.out.println();
    }
    
}
public void invertedRightAngleNumberPattern(int n){
     
      
      for(int i=0;i<n;i++){
       for(int j=n;j>i;j--){
        System.out.print(n-j+1);
       }
       System.out.println();
    }
}
public void starPraymidPattern(int n){
     
      
    for (int i = 0; i < n; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }
        System.out.println();

    }
       

}
public void InvertedstarPraymidPattern(int n){
     
      
    for (int i = 0; i < n; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*n-(2*i+1);j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
        System.out.println();

    }
    
       

}
public void diamondPraymidPattern(int n){
        this.starPraymidPattern(n);
        this.InvertedstarPraymidPattern(n);

    }

    public void HalfdiamondPraymidPattern(int n){
        for(int i=1;i<=2*n-1;i++){
        
            // stars would be equal to the row no. uptill first half
            int stars = i;
            
            // for the second half of the rotated triangle.
            if(i>n) stars = 2*n-i;
            
            // for printing the stars in each row.
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            
            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }

    }
    public void binaryNumberPattern(int n){
        int k;
        for(int i=0;i<n;i++){
            if(i%2==0) k=1;
            else k=0;

            for(int j=0; j<=i;j++){
                System.out.print(k);
                k=1-k;

            }
            System.out.println();
            
        }

    }
    public void NumbercrownPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void increasingNumberPattern(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }



    public static void main(String args[]){
        Pattern as = new Pattern();
        //as.rectangularPattern(3);
        //as.rightAngleTrianglePattern(3);
        //as.rightAngleNumberPattern(5);
        //as.rightAngleSameNumberPattern(5);
        //as.invertedRightAngleTrianglePattern(5);
       // as.invertedRightAngleNumberPattern(5);
       //as.starPraymidPattern(5);
      // as.InvertedstarPraymidPattern(5);
      //as.diamondPraymidPattern(5);
      //as.HalfdiamondPraymidPattern(5);
      //as.binaryNumberPattern(5);
      //as.NumbercrownPattern(6);
      as.increasingNumberPattern(5);

        
    }
    
}

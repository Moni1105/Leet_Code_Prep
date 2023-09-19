public class ArraySecondMaxMIN {
    
    public static int[] getSecondOrderElements(int n, int []a) {
    
        int Highest=a[0];
        int secondHighest=Integer.MIN_VALUE;
        int Smallest=a[0];
        int secondSMallest=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
             if(a[i]>Highest){
                secondHighest=Highest;
                Highest=a[i];
            }else if(a[i]!=Highest && a[i]>secondHighest){
                    secondHighest=a[i];
            }

            if(a[i]<Smallest){
                secondSMallest=Smallest;
                Smallest=a[i];
            }else if((a[i]<secondSMallest && a[i]!=Smallest)){
                secondSMallest=a[i];
            }
        }
        int b[]= new int[2];
        b[1]=secondSMallest;
        b[0]=secondHighest;
        return b;
    }
    public static void main (String args[]){
        ArraySecondMaxMIN as= new ArraySecondMaxMIN();
        int[] n= new int[]{9,9,9};

       System.out.println(as.getSecondOrderElements(4,n));

    }
    
}

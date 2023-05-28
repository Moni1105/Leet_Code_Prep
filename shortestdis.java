public class shortestdis {
    public int nearestValidPoint(int x, int y, int[][] points) {
int smallest1=Integer.MAX_VALUE;
int flag1=0;
int abc=-1;

        for(int i = 0; i < points.length; i++) {
            
            if(points[i][0]==x||points[i][1]==y)
            {
                    
                    flag1=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                    if(flag1<smallest1){
                        smallest1= flag1;
                        abc=i;
                    }
                }
            
            
        }
 return abc;
      
}
public static void main(String[] args)throws java.lang.Exception 
    {
        shortestdis  as = new shortestdis();
        int[][] arr={{50,42},{70,46},{50,39},{21,3},{79,76},{38,90}};
        int res=as.nearestValidPoint(37,53,arr);
       System.out.println(res);
    }
    }
    
// {1,2},{3,1},{2,4},{2,3},{4,4}
//{{1,1},{6,2},{1,5},{3,1}}
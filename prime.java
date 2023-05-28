import java.util.*;
import java.lang.*;
import java.io.*;
class prime {
    public int diagonalPrime(int[][] nums) {
        int max=0;
       
        
            for(int i=0;i<nums.length;i++)
            {
               
                //if((i==j)||(i== nums.length-1 && j==0)||(j== nums.length-1 && i==0)){
                   if(chekprime(nums[i][i]))
                    {
                        max=Math.max(max,nums[i][i]);
                    }
                    int z=nums.length-i-1;
                    if(chekprime(nums[z][i])) 
                    {
                        max=Math.max(max,nums[i][i]);
                    }
               
            }
        
        

    return max;
}
public boolean chekprime(int x){
    for (int k = 2; k<= x/2; k++) 
    {
       if ((x % k)== 0)
                {
              return false;
        
  
                }
                
}
    return true;

}
public static void main(String[] args)throws java.lang.Exception 
{
    prime  as = new prime();
    int[][] arr=new int[][]{{1,2,3},{5,6,7},{9,10,11}};
    int res=as.diagonalPrime(arr);
    System.out.println(res);
    
}

}
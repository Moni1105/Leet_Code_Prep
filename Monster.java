import java.lang.*;
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Monster {
     
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s= new Scanner(System.in);
		int T=s.nextInt();
		
		
		while(T-->0)
		{
		    int H=s.nextInt();
		    int X=s.nextInt();
		    int Y=s.nextInt();
			int Z=0; 
			int[] result = new int[3];
		    if(H+Y<X)
		    {
		        System.out.println("1");
		    }else{
		        while(Z<3){
		        result[Z]=(H+Y)-X;
		        H=result[Z];
                Z++;
            }
            if(result[0]>result[1]&& result[1]>result[2])
            {
             System.out.println("1");
            }else{
             System.out.println("0");
            }
        }
        }
             
            
               
		    
	

    }

}  


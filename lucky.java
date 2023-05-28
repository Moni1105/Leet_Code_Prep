/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lucky
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		int T=s.nextInt();
        
	while(T-->0)
		{
		    long N=s.nextLong();
            if(N%2!=0)
            {
                System.out.println(1); 
            }else
            {
                long rs=N/2;
                int power=1;
                while(rs>1)
                {
                    N=rs;
                   // System.out.println("N is"+N);
                    if(N%2==0)
                    {
                    rs=N/2;
                    power++;
                    }else{
                        rs=0;
                    }

                }
                //System.out.println("power is"+power);
               if(power%2==0)
               {
                System.out.println(1);
               }else{
                System.out.println(0);
               }
            }
       
            

  
	
		}
	}
}

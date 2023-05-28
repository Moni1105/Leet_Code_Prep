/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class expression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0)
		{
		    long A=s.nextLong();
		    long B=s.nextLong();
		    long C=s.nextLong();
		    long[] rs=new long[]{A,B,C};
            Arrays.sort(rs);
            if(rs[2]==rs[1]+rs[0])
            {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
		    
		}
	}
}

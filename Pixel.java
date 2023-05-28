/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pixel {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        while (T-- > 0) {
            long H = s.nextLong();
            long W = s.nextLong();
            long x = s.nextLong();
            long y = s.nextLong();
            long K = s.nextLong();
            long value=((W-x)*(W-x))+((H-y)*(H-y));
            double res= Math.sqrt(value);
            //System.out.println(res);
            if(res>K)
            {
                System.out.println(0);
            }else{
                System.out.println(1); 
            }

        }
    }
}

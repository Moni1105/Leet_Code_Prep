/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Proximity {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        while (T-- > 0) {
            double p = s.nextDouble();
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
          if(z==1)
          {
            p=p+((p*y)/100);
          }else{
            p=p-((p*x)/100);
          }
          System.out.println(
            String.format("%.10f", p));
        }
    }
}

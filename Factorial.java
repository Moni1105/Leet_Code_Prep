import java.util.*;
public class Factorial {
    public int fact(int n) {
        if (n > 1) {
            return n *fact(n - 1);
       
        } else {
            return 1;
           
        }
    }

    public static void main(String args[]) {
        Factorial mc = new Factorial();
        System.out.println(mc.fact(5));

    }
}
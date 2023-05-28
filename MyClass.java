import java.util.*;
public class MyClass {
    public int sumofnatural(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return n + sumofnatural(n - 1);
        }
    }

    public static void main(String args[]) {
        MyClass mc = new MyClass();
        System.out.println(mc.sumofnatural(5));

    }
}
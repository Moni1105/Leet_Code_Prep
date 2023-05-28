import java.util.*;
import java.lang.*;
import java.io.*;
public class avgSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        salary[0]=0;
        salary[salary.length-1]=0;
        double sum=0;
        for (int i=0;i<salary.length;i++)
    {
         sum+= salary[i];

    }
      return sum/(salary.length-2); 
        
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        avgSalary as = new avgSalary();
        int[] arr1=new int[]{4000,3000,1000,2000};
       double res= as.average(arr1);
       System.out.println(res);
    }
}

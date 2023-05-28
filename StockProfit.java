import java.util.*;
import java.lang.*;
import java.io.*;
class StockProfit {
    
       
            public int maxProfit(int prices[]) {
                int minprice = Integer.MAX_VALUE;
                int maxprofit = 0;
                for (int i = 0; i < prices.length; i++) {
                    if (prices[i] < minprice)
                        minprice = prices[i];
                    else if (prices[i] - minprice > maxprofit)
                        maxprofit = prices[i] - minprice;
                }
                return maxprofit;
            
        }
    public static void main(String[] args)throws java.lang.Exception 
    {
        StockProfit  as = new StockProfit();
        int[] arr=new int[]{7,6,4,3,1};
        int res=as.maxProfit(arr);
        System.out.println(res);
        
}
}
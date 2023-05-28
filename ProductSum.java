public class ProductSum {
    // you need to treat n as an unsigned value
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        String value=Integer.toString(n);
        for(int i=0;i<value.length();i++){
            sum+=Character.getNumericValue(value.charAt(i));
            product*=Character.getNumericValue(value.charAt(i));
        }
        return product-sum;
        
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        ProductSum  as = new ProductSum();
        int res=as.subtractProductAndSum(11110111);
       System.out.println(res);
    }
}
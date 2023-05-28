public class Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String value =Integer.toBinaryString(n);
        int count =0;
        for (int i=0;i<value.length();i++){
       count+= value.charAt(i)=='1'?1:0;
        }
        return count;
    
    
    
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        Bits  as = new Bits();
        int res=as.hammingWeight(11110111);
       System.out.println(res);
    }
}
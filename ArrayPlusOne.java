class ArrayPlusOne {
    public int[] plusOne(int[] digits) {
       /*   String a ="";
        for(int i=0;i<digits.length;i++){
            a+=digits[i];
        }
        double num= Double.parseDouble(a);
        num= num+1;
        String b=String.valueOf(num);
        int[] res= new int[b.length()];
        for(int i=0;i<b.length();i++){
            res[i]=Character.getNumericValue(b.charAt(i));
        }
        return res;*/

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main (String args[]){
        ArrayPlusOne as= new ArrayPlusOne();
        int[] n= new int[]{};

       System.out.println(as.plusOne(n));

    }
}
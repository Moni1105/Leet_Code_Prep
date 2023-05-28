class signArr {
    public int arraySign(int[] nums) {
        int prod=1;
        for (int n:nums)
        {
            if(n<0){
                prod*=-1;
            }else if(n>0)
            {
                prod*=1;
            }else{
                prod=0;
            }
//prod*= Integer.parseInt(Integer.toString(n).substring(0, 1));

        }
     return prod;
    }
    public static void main(String[] args)throws java.lang.Exception 
    {
        signArr  as = new signArr();
        int[] arr=new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int res=as.arraySign(arr);
       System.out.println(res);
    }
}

 /* if(prod>0)
        {
            return 1;
        }else if(prod<0){
            return -1;
        }else{
            return 0;
        }*/ 
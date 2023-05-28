class Majority {
    public int majorityElement(int[] nums) {
        int val=0;
        int max=0;
if(nums.length>1){
for(int i=0;i<nums.length;i++)
{
    int count =1;
    if(i>0)
    {
       if(nums[i]==nums[i-1])
       continue;
    }
    for(int j=i+1;j<nums.length;j++)
    {
    
    if(nums[i]==nums[j]){
       count++;
if(count> max)
{
    max=count;
    val= nums[i];
}

    }
}

}
}
else{
    val= nums[0];
}
return val;
    }
public static void main(String[] args)throws java.lang.Exception 
    {
        Majority  as = new Majority();
        int[] arr= new int[]{2,2,2,2,1,1,1};
        int res=as.majorityElement(arr);
        
            System.out.println(res);
        
    }
}
    


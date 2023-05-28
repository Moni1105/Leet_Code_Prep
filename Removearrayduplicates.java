import java.util.*;
class Removearrayduplicates {
    public int removeDuplicates(int[] nums) {
        Set<Integer> se= new HashSet<Integer>();  
        for(int n:nums){
            se.add(n);
        }
        int k=se.size();
        /*Integer[] expectednums= new Integer[nums.length];
        se.toArray(expectednums);
        */
        TreeSet<Integer> treeSet = new TreeSet<Integer>(se);
        int i=0;
        for(Integer j:treeSet){
            nums[i]=j;
i++;
        }
        for(int m=k;m<nums.length;m++){
            nums[m]=Integer.MAX_VALUE;
        }

        
return k;
            
    }
    public static void main(String args[]){
        Removearrayduplicates as= new Removearrayduplicates();
        int[] arr= new int[]{0,0,1,1,1,2,2,3,3,4};
              int res=as.removeDuplicates(arr);
        System.out.println(res);
    
}
}

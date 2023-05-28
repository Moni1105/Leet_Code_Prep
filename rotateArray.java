 public class rotateArray {
   // public void rotate(int[] nums, int k) {


        /*************************brute force algorithm 
        //1.take previous as last number of the array 
       // 2. swap the previous with nums[i] to nums[i=n-1]
       //3.if we have to swap 3 times then use a loop until less than 3 sawp 
        // speed up the rotation
        k %= nums.length;
        int temp, previous;
        for (int i = 0; i < k; i++) {
          previous = nums[nums.length - 1];
          for (int j = 0; j < nums.length; j++) {
            temp = nums[j];
            nums[j] = previous;
            previous = temp;}}
            time complexity O(n*k) space is O(1)*/


    /*********************using extra array */
    //step 1.create new array with size of nums
    //step 2.assign the numbers to new array using a[(i+k)%nums.length]
    //eg... 3% 7 = 3,4%7=4,5%7=5,6%7=6,7%7=0,8%7=1,9%7=2,10%7=3,it gives remainder
        /*    int[] a = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
              a[(i + k) % nums.length] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
              nums[i] = a[i];
            }  time Comp-O(n),space-O(n)- we used extra array  */

/**************************using cyclic replacement********************* */

/*k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }tC- O(n),SC- O(1)*/

//*********to reverse an array */
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for(int n:nums)
        System.out.println(n);
    }
    public void reverse(int[] num, int start, int end){
       while(start<end){      
        int temp=num[start];
        num[start]=num[end];
        num[end]= temp;
        start++;
        end--;
       }
    }
    





        
    
      
      public static void main(String args[]){
        rotateArray as= new rotateArray();
        int[] mat = new int[]{1,2,3,4,5,6,7};
        as.rotate(mat,3);
       
}
    }
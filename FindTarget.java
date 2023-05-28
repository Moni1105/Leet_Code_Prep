class FindTarget {
        public int[] twoSum(int[] numbers, int target) {
            int[] arr= new int[2];
          if(numbers.length==1){
              arr[0]=1;
              arr[1]=2;
              
          }else{
            int left=0;
             int right=numbers.length-1;
             while(left<right){
                 
               if(numbers[left]+numbers[right]==target)
             {
                 arr[0]=left+1;
                 arr[1]=right+1;
                 return arr;  
             }else if(numbers[left]+numbers[right]>target){
                 right--;
             }else{
                 left++;
             }
             }
    
          }
          return arr;           
        }

        public static void main(String args[]){
            FindTarget as= new FindTarget();
            int[] mat = new int[]{2,7,11,15};
          int[] res=  as.twoSum(mat,9);
          for(int n:res)
          System.out.println(n);
           
    }

    }
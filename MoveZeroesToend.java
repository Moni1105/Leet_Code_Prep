class MoveZeroesToend {
    public void moveZeroes(int[] nums) {
        if(nums.length>1)
        {

        int start= 0;
        int end =start+1;
        while(end<=nums.length-1){
            
            if(nums[start]==0&&nums[end]==0)
            {
                while(nums[end]==0){
                    end=end+1;
                    if(end>nums.length-1)
                    break;
                }

            }
            if(end<=nums.length-1){
            if(nums[start]==0 && nums[end]!=0){
                swap(nums,start,end);
            }
        }
            start++;
            end++;

        }
        }
        for(int n:nums)
        System.out.println(n);

        
        
    }
    public void swap(int[] nums, int start,int end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }

    public static void main(String args[]){
        MoveZeroesToend as= new MoveZeroesToend();
        int[] mat = new int[]{0,0,0,0,0,0,1,1,1};
        as.moveZeroes(mat);
       
}
}
/* while(end<=nums.length-1){ 
          if(nums[start]!=0){
            start++;
            end++;
          }else if(nums[start]==0&& nums[end]==0){
            while(nums[end]==0){
                end = end+1;
                if(end>nums.length-1)
                break;
            }

        
          if(end <=nums.length-1) { 
            if(nums[end]!=0){
                int temp= nums[start];
                nums[start]= nums[end];
                nums[end]=temp;
                start=start+1;
                end=end+1;
            }
        }
          }
          else{
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start= start+1;
            end=start+1;
          }        
        }
    }

        for(int n:nums)
        System.out.println(n); */
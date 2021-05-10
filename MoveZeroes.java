class Solution {
    public void moveZeroes(int[] nums) {
       
        int zeroes = 0;
        
       for(int i = 0 ; i<nums.length ; i++){
          if(nums[i] == 0)
              zeroes++ ;
       }
       int index = 0; 
       for(int i = 0 ; i<nums.length; i++){
         if(nums[i] != 0)
            nums[index++] = nums[i]; 
       } 
       
       for(int i = 0 ; i<zeroes; i++)
           nums[index++] = 0;
    }
}

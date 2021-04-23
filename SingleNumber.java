**** 0 ^ 2 = 2 | 2^2 = 0 | 0 ^ 1 = 1 ****
class Solution {
    public int singleNumber(int[] nums) 
    {
        int result = 0;
        for(int i=0; i<nums.length; i++)
        {
            result ^= nums[i];
        }
        return result;    
    }
}


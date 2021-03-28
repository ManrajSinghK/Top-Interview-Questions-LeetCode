class Solution {
    public int maxSubArray(int[] nums) 
    {
       int max=nums[0];
        int cur=max;
        
        for(int i=1;i<nums.length;i++)
        {
            cur=Math.max(cur+nums[i],nums[i]);
            max=Math.max(cur,max);
        }
        return max;
    }
}

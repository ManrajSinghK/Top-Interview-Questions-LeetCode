class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length*(nums.length + 1)/2;
        int sum = 0;
        for (int num=0; num<nums.length; num++) 
            sum += nums[num];
        return result - sum;
    }
}

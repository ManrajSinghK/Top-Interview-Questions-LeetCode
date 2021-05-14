class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub_res = new ArrayList<>();
        
        if(nums.length == 0 || nums == null)
            return res;
        
        boolean[] used=new boolean[nums.length];
        helper(nums, res, sub_res, used);
        return res;
    }
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> sub_res, boolean[] used)
    {
        if(sub_res.size() == nums.length)
        {
            res.add(new ArrayList(sub_res));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
                continue;
            used[i] = true;
            sub_res.add(nums[i]);
            helper(nums, res, sub_res, used);
            sub_res.remove(sub_res.size() - 1);
            used[i] = false;
            while( i+1<nums.length && nums[i] == nums[i+1])
            {
                ++i;
            }
        }
    }
}

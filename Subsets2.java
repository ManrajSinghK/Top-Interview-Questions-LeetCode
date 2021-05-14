class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<Integer>(), res);
        return res;
    }
    public void helper(int index, int[] nums, List<Integer> sub_res, List<List<Integer>> res)
    {
        res.add(new ArrayList(sub_res));
        for(int i=index; i< nums.length; i++)
        {
            if(i>index &&  nums[i]== nums[i-1])
                continue;
            sub_res.add(nums[i]);
            helper(i+1, nums, sub_res, res);
            sub_res.remove(sub_res.size() - 1);     
        }
    }
}

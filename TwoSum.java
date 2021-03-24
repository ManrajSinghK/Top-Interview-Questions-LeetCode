class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
     Map<Integer,Integer> maprun=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(maprun.containsKey(comp))
            {
                return new int[]{maprun.get(comp),i};
            }
            maprun.put(nums[i],i);
        }
    throw new IllegalArgumentException("No");
    }
}

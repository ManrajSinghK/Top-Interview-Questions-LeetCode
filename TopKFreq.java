class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((num1, num2) -> map.get(num1)-map.get(num2));
        for( int i:map.keySet())
        {
            pq.add(i);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        int[] out = new int[k];
        for(int i= k-1; i>=0 ;--i)
        {
            out[i]=pq.poll();
        }
        return out;
    }
}

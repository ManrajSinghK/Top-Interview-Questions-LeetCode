class Solution {
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length <= 1)
            return intervals;
        
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals, (arr, arr2) -> Integer.compare(arr[0], arr2[0]));
        
        int[] current = intervals[0];
        list.add(current);
        
        for(int[] interval : intervals)
        {
            int current_begin=current[0];
            int current_end=current[1];
            int next_begin=interval[0];
            int next_end=interval[1];
            
            if(current_end >= next_begin)
            {
                current[1] = Math.max(current_end, next_end);
            }
            else
            {
                current = interval;
                list.add(current);
            }
        }
        return list.toArray( new int[list.size()][]);
    }
}

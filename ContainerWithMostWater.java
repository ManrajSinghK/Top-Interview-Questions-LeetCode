class Solution {
    public int maxArea(int[] height) 
    {
        int a=0;
        int b=height.length-1;
        int max_area=0;
        
        while( a<b )
        {
            if(height[a] < height [b])
            {
                max_area=Math.max(max_area, height[a] * (b-a));
                a++;
            }
            else
            {
                max_area=Math.max(max_area, height[b] * (b-a));
                b--;
            }
        }
        return max_area;
        
    }
}

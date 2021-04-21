class Solution {
    public int numIslands(char[][] grid) 
    {
        int i=0;
        int r=grid.length;
        int c=grid[i].length;
        int count=0;
        
        for(i=0;i < r;i++)
        {
            for(int j=0;j < c;j++)
            {
                if(grid[i][j] == '1')
                {
                    count += 1;
                    BFS(grid,i,j);
                }
            }
        }
        return count;       
    }
    public void BFS(char[][] grid, int i, int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        BFS(grid,i+1,j);
        BFS(grid,i-1,j);
        BFS(grid,i,j+1);
        BFS(grid,i,j-1);
    }
}

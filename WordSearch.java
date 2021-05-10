class Solution {
    boolean[][] seen;
    public boolean exist(char[][] board, String word) 
    {
        int row =board.length;
        int col =board[0].length;
        seen = new boolean[row][col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                if(word.charAt(0) == board[i][j] && search(i, j, 0, word, board))
                { return true; }
            }
        }
        return false;
    }
    public boolean search(int i, int j, int index, String word, char[][] board)
    {
        if(index == word.length())
        {
            return true;
        }
        
        if( i<0 || j<0 || i>=board.length || j>=board[i].length || seen[i][j] || word.charAt(index) != board[i][j])
        { return false; }
        
        seen[i][j] = true;
        if(search(i+1, j, index+1, word, board) ||
           search(i-1, j, index+1, word, board) ||
           search(i, j+1, index+1, word, board) ||
           search(i, j-1, index+1, word, board))
        {
            return true;
        }
        seen[i][j] = false; 
        return false;
    }
}

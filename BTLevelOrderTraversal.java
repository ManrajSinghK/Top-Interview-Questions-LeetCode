class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode current = q.remove();
                currentLevel.add(current.val);
                if(current.left != null)
                {
                    q.add(current.left); 
                }
                if(current.right != null)
                {
                    q.add(current.right);
                }
            }
            result.add(currentLevel);
        }
        return result; 
    }
}

// LEFT -> ROOT -> RIGHT
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        Stack<TreeNode> s=new Stack<>();
        List <Integer> out=new ArrayList<>();
        
        if (root == null)
            return out;
        
        TreeNode current = root;
        while(current!=null || !s.isEmpty())
        {
            while(current!=null)
            {
                s.push(current);
                current = current.left;
            }
            
            current = s.pop();
            out.add(current.val);
            current=current.right;
        }
        return out;
    }
}

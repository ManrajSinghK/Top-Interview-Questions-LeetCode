class Solution {
    public boolean isValidBST(TreeNode root)
    {
        Stack<TreeNode> st = new Stack();
        double left_child_val = - Double.MAX_VALUE;
        while( !st.isEmpty() || root != null)
        {
        while(root != null)
        {
            st.push(root);
            root = root.left;
        }
        root = st.pop();
        if( root.val <= left_child_val)
            return false;
        
        left_child_val = root.val;
        root = root.right;
    }
    return true;    
    }
}

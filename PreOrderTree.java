
class Solution {
    public List<Integer> preorder(Node root) 
    {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> out = new LinkedList<>();
        
        if( root == null )
            return out;
        
        stack.push(root);
        while(!stack.isEmpty())
        {
            Node node = stack.pop();
            out.add(node.val);
            Collections.reverse(node.children);
            for(Node child : node.children)
            {
                stack.push(child);
            }
        }
        return out;
    }
}

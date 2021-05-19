
class Solution {
    public List<Integer> postorder(Node root) 
    {
        Stack<Node> stack =new Stack();
        LinkedList<Integer> list = new LinkedList<>();
        
        if(root == null)
        {
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty())
        {
            Node node = stack.pop();
            list.addFirst(node.val);
            for(Node child: node.children)
            {
                stack.push(child);
            }
        }
        return list;
    }
}

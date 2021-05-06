/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length == 0)
            return null;
        return construct(nums, 0, nums.length - 1);   
    }
    public TreeNode construct(int[] nums, int left, int right)
    {
        if(left>right)
            return null;
        
        int mid = left + (right-left) / 2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left = construct(nums, left, mid-1);
        node.right = construct(nums, mid+1, right);
        return node;
        
    }
}

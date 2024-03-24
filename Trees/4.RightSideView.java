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
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        // Call the recursive rightView function to populate the right side view of the tree
        rightView(root, result, 0);
        return result;
    }
    
    // Recursive function to populate the right side view of the tree
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        // If the current node is null, we have reached the end of the tree or a leaf node
        if(curr == null){
            return;
        }
        
        // If the current depth is equal to the size of the result list, it means we are
        // visiting the rightmost node at this depth for the first time
        // So, add the current node's value to the result list for the right side view
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        
        // Recursively call the rightView function on the right and left subtrees, 
        // incrementing the current depth by 1 for each recursive call
        // The right subtree is processed before the left subtree, ensuring that the rightmost 
        // node at each depth is added to the result list
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }
}
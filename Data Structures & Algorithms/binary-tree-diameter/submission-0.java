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
    int maxdia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculatedia(root);
        return maxdia;
    }
    private int calculatedia(TreeNode node){
        if(node==null){
            return 0;
        }

        int right=calculatedia(node.right);
        int left=calculatedia(node.left);

        int dia=right+left;
        maxdia=Math.max(maxdia,right+left);

        return Math.max(right,left)+1;
    }
}

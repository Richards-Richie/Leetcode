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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || q.val !=p.val){
            return false;
        }
        boolean b=isSameTree(p.left,q.left);
        if(b == false){
            return false;
        }
        boolean c=isSameTree(p.right,q.right);
        if(c == false){
            return false;
        }
        return true;
    }
}
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
    public int diameterOfBinaryTree(TreeNode root) {
       return diameter(root).dm;
    }
    static class Info{
        int dm;
        int ht;
        Info(int dm,int ht){
            this.dm=dm;
            this.ht=ht;
        }
    }
    public Info diameter(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        Info left_i=diameter(root.left);
        Info right_i=diameter(root.right);
        int final_d=Math.max(Math.max(left_i.dm,right_i.dm),left_i.ht+right_i.ht);
        int final_h=Math.max(left_i.ht,right_i.ht)+1;
    return new Info(final_d,final_h);
    }
}
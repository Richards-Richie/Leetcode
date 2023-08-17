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
    public int maxPathSum(TreeNode root) {
        // if(root == null){
        //     return 0;
        // }
        // if(root.left == null && root.right == null){
        //     return root.val;
        // }
        // int max_s=0;
        // int left_s=maxPathSum(root.left);
        // int right_s=maxPathSum(root.right);
        // if((max_s+root.val) > max_s){
        //     max_s=max_s+root.val;
        //     max_s=(max_s+left_s)>max_s?max_s+left_s:max_s;
        //     max_s=(max_s+right_s)>max_s?max_s+right_s:max_s;
        // }else{
        //    max_s=Math.max(left_s,right_s);
        // }
        // return max_s;
        
        int []ans=new int[1];
        ans[0]=Integer.MIN_VALUE;
        max_s(root,ans);
        //maxPathDown(root,ans);
        return ans[0];
    }
    
    public int max_s(TreeNode root,int []maxi){
        if(root == null){
            return 0;
        }
        int l_s=Math.max(0,max_s(root.left,maxi));
        int r_s=Math.max(0,max_s(root.right,maxi));
        maxi[0]=Math.max(maxi[0],l_s+r_s+root.val);
        return root.val+Math.max(l_s,r_s);
    }
}
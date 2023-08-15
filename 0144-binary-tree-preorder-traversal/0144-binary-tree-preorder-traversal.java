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
    List <Integer>ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
       
    //    if(root == null){
    //        return ans; 
    //    }
    //    int a=root.val;
    //    ans.add(a);
    //    preorderTraversal(root.left);
    //    preorderTraversal(root.right);
    //    return ans;
        if(root == null){
            return ans;
        }
        Stack <TreeNode>s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode cur=s.pop();
            if(cur!=null){
                if(cur.right!=null){
                    s.push(cur.right);
                }
                if(cur.left!=null){
                    s.push(cur.left);
                }
            }
             ans.add(cur.val);
            
        }
        return ans;
    }
}











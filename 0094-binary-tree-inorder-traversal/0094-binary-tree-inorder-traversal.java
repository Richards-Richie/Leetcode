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
    public List<Integer> inorderTraversal(TreeNode root) {
        // if(root == null){
        //   return ans;
        // }
        // inorderTraversal(root.left);
        // ans.add(root.val);
        // inorderTraversal(root.right);
        if(root == null){
            return ans;
        }
        TreeNode node=root;
        Stack <TreeNode>s=new Stack<>();
        while(true){
            if(node !=null){
                s.push(node);
                node=node.left;
            }else{
                if(s.isEmpty()){
                    break;
                }
                node=s.pop();
                ans.add(node.val);
                node=node.right;
            }
        }
        return ans;
    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> ans=new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue <TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            int listSize=q.size();
            List <Integer>list1=new ArrayList<>();
            for(int i=0;i<listSize;i++){
                TreeNode cur=q.remove();
                if(cur!=null){
                    list1.add(cur.val);
                    if(cur.left!=null){
                        q.add(cur.left);
                    }
                    if(cur.right!=null){
                        q.add(cur.right);
                    }
                }
               
            } ans.add(list1);
        }
        return ans;

    }
}


























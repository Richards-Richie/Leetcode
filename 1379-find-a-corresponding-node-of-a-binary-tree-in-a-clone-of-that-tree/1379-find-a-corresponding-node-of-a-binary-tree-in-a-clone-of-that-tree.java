/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       
        Queue <TreeNode>q=new LinkedList<>();
        q.add(cloned);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur!=null){
                if(cur.val == target.val){
                    return cur;
                }
                else{
                    if(cur.left!=null){
                        q.add(cur.left);
                    }
                    if(cur.right!=null){
                        q.add(cur.right);
                    }
                }
            }else{
                if(!q.isEmpty()){
                    q.add(null);
                }else{
                    break;
                }
            }
        }
        return null;
    }
}













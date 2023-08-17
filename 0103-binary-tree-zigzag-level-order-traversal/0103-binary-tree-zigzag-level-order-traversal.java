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
    List<List<Integer>> ans =new ArrayList<>();
    Queue <TreeNode>q=new LinkedList<>();
    boolean right=false;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root == null){
            return ans;
        }  
        q.add(root);
        while(!q.isEmpty()){
            int listSize=q.size();
            List<Integer> innerlist=new ArrayList<>();
            if(!right){
               innerlist=left(listSize,innerlist);
                ans.add(innerlist);
                right=true;
            }else{
                innerlist=fill(innerlist,listSize);
                innerlist=right(listSize,innerlist);
                innerlist=remove(innerlist,listSize);
                ans.add(innerlist);
                right=false;
            }
           
        }
        return ans;
    }
    public List<Integer>left(int listSize,List<Integer> innerlist){
        for(int i=0;i<listSize;i++){
                TreeNode cur=q.remove();
            if(cur!=null){
                innerlist.add(i,cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        } 
        return innerlist;     
    }
    public List<Integer>right(int listSize,List<Integer> innerlist){
        for(int i=listSize-1;i>=0;i--){
            TreeNode cur=q.remove();
            if(cur!=null){
                innerlist.add(i,cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        return innerlist;
    }
    public List<Integer>fill(List<Integer> innerlist,int listSize){
        for(int i=0;i<listSize;i++){
            innerlist.add(-1);
        }
        return innerlist;
    }
    public List<Integer> remove(List<Integer>innerlist,int listSize){
        for(int i=0;i<innerlist.size();i++){
            if(innerlist.get(i) == -1){
                innerlist.remove(i);
            }
        }
        return innerlist;
    }
}






















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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        inOrder(root,a);
        for(int i=1;i<a.size();i++){
            if(a.get(i)<=a.get(i-1)){
                return false;
            }  
        }
        return true;   
    }
    public void inOrder(TreeNode root, ArrayList a){
        if(root==null){
            return;
        }
        inOrder(root.left,a);
        a.add(root.val);
        inOrder(root.right, a);
    }
    
}
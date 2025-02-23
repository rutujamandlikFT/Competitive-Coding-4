
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    private int height(TreeNode root){
        //base
        if(root == null) return 0;
        
        //logic
        return Math.max(height(root.left) ,height(root.right)) + 1;
    }
    
    
}

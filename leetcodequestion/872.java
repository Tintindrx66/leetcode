/*The idea is to find nodes whose left and right is null, comparing values of leaves on both trees to check whether both trees are leaf-similar */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        while(root1!=null||root2!=null){
            if((root1.left==null&&root1.right==null)||(root2.left==null&&root2.right==null)){
                if(root1.val==root2.val){
                    return true;
                }
            }
            
        }     
        boolean leftpath=leafSimilar(root1.left, root2.left);
        boolean rightpath=leafSimilar(root1.right, root2.right);
        
        return leftpath||rightpath;
        
        
    }
}
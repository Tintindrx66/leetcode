/*The idea is to find nodes whose left and right is null, comparing values of leaves on both trees to check whether both trees are leaf-similar */

// COMMENT FROM RAY
// I think you draw a wrong conclusion which your code based on 
// Note that leaf sequence is the same does not mean sequence from left child is the same and sequence from the right child is the same
// for example. the first tree have empty right sequence, the right tree have empty left sequqnce
// however, they can have the same leaf sequence
//     1       1
//    /         \
//   2           2
//  /             \ 
// 3               3
//
// try construct the leaf sequence for both trees first, and then compare the sequence.

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

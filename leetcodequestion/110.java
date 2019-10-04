/*balanced binary tree*/
/*As question shown, a binary tree in which the depth of the two subtrees of every node
never differ by more than 1.Thus, only judge differenceof max depth between left path and right path*/
/*In order to easily understand, we can build Type class that includes isbalanced and maxdepth and helper function to achieve condition of a balanced binary tree. It still used divide and conquer after considering special case where root is null. Then it would return false if left and right subtree is not balanced, also including more than one difference of max depth between these two subtrees. Finally, calling helper function refers whether this binary tree is balanced or not*/

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        x=val;
    }
}
class Type{
    int maxdepth;
    boolean isbalance;
    Type(boolean isbalance, int maxdepth){
        this.maxdepth=maxdepth;
        this.isbalance=isbalance;
    }
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root).isbalance;
    }
    private Type helper(TreeNode root){
        if(root==null){
            return new Type(true, 0);
        }
        Type left=helper(root.left);
        Type right=helper(root.right);
        if(!left.isbalance||!right.isbalance){
            return new Type(false, -1);
        }
        if(Math.abs(left.maxdepth-right.maxdepth)>1){
            return new Type(false, -1);
        }
        int depth=Math.max(left.maxdepth, right.maxdepth)+1;
        return new Type(true, depth);
    }
}

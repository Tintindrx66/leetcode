/*Merge two binary tree*/
/*First of all: consider special cases that include both trees are null or one of each binary tree is null*/
/*The second step: merge two binary tree when inititlizing TreeNode res can store t1 and t2 values if both binary trees are not null*/
/*Thirdly, use divide and conquer to search path from left and right*/
/*Finally res can store merge values from both binary tree*/

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){x=val;}
}
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return null;
        }
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        TreeNode res=new TreeNode(t1.val+t2.val);
        
        res.left=mergeTrees(t1.left, t2.left);
        res.right=mergeTrees(t1.right, t2.right);
        
        return res;
        
        
    }
}
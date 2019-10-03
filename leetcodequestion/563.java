/*Binary Tree Tilt*/
/*First of all:consider special case when root is null. Then, use divide and conquer to search
left and right subtree. Finally computed tilt and return result*/
public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}

}
public int findTilt(TreeNode root) {
        int tilt=0;
        if(root==null)return 0;
        int leftpath=findTilt(root.left);
        int rightpath=findTilt(root.right);
        
        
        tilt+=Math.abs(leftpath-rightpath);
      
        return tilt;
    }
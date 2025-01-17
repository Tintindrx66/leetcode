/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){return res;}
        
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;++i){
                Node node=queue.poll();
                level.add(node.val);
                
                if(node.children!=null){
                    queue.addAll(node.children);
                }  
            }
            res.add(level);
        }
        return res;
    }
    
    
}
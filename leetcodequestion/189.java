#rotate number of elements used by two queues.
class Solution {
    public void rotate(int[] nums, int k) {
        
        
        if(nums==null||nums.length==0){return;}
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=nums.length-1;i>=0;i--){
            q1.offer(nums[i]);  
            
        }
        for(int j=0;j<k;j++){
            q2.offer(q1.poll());
            q1.offer(q2.poll());
        }
        for(int i=0;i<nums.length-1;i++){
            q1.poll();    
        }
        
    }
}
/* The idea is to continue to compare values between the previous one and
the current one if the previous value is larger than the current one while
the current one referred to data, which means find a larger value than 
the previous one in the first time. Then results would be recorded and 
stored into res[]*/
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null){return null;}
        
        int max=Integer.MIN_VALUE;
        int data=0;
        List<ListNode> list=new ArrayList<>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();++i){
            for(int j=i+1;j<list.size();++j){
                if(list.get(i).val>=list.get(j).val){
                    continue;
                         
                }else if(list.get(i).val<list.get(j).val){
                    data=list.get(j).val;
                    
                }else{
                    data=0;
                    
                }
                if(data>max){
                    max=data;
                }
                res[i]=max;
                max=Integer.MIN_VALUE;
            }
        }       
        return res;
    }
}
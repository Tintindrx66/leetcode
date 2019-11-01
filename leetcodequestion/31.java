class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0){return;}
        int left=nums.length-1;
        int pos;
        while(left>0&&nums[left-1]>=nums[left]){
            --left;
        }   
        --left;
        System.out.print(left+" ");
        if(left==-1){
            reverse(nums, 0, nums.length-1);
        }else{
            pos=nums.length-1;
            while(nums[pos]<=nums[left]&&pos>left){
                --pos;
            }
            System.out.print(pos+" ");
            
            int temp=nums[pos];
            nums[pos]=nums[left];
            nums[left]=temp;
            reverse(nums, left+1, nums.length-1);
        }
    }
    private void reverse(int[] nums, int left, int right){
        int l=left;
        int r=right;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            ++l;
            --r;
        }
    }
}
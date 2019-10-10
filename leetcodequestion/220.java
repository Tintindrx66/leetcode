class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums==null||nums.length==0||k<=0||t<0){return false;}
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;(j-i)<=k&&j<nums.length;j++){
                
                if(Math.abs(Long.valueOf(nums[i])-Long.valueOf(nums[j]))<=t){
                    return true;
                }
                
            }
        }
        return false;
    }
}
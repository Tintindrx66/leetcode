class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0){return 0;}
        
        int max=1;
        Arrays.sort(nums);
        int left=0;
        int right;
        while(left < nums.length) {
            right=left+1;
            while(right<nums.length && nums[right] == nums[right-1]+1 ) {
                ++right;
                max = Math.max(max, right-left);
                left = right;
            }
            
        }
        return max;
    }
}
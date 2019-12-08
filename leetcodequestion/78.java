class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }
    private void dfs(int[] nums, List<List<Integer>> res, List<Integer> curlist, int index) {
        if(index == nums.length) {
            List<Integer> temp = new ArrayList<>(curlist);
            res.add(temp);
            return;
        }   
        curlist.add(nums[index]);
        dfs(nums, res, curlist, index+1);
        curlist.remove(curlist.size()-1);
        dfs(nums, res, curlist, index+1);
    }
}
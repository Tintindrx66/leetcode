class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null||nums.length==0){return 0;}
        Map<Integer, Integer> map=new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for(Integer key: map.keySet()){
            if(key==1){
                return map.get(key);
            }
        }
        return 0;
    }
}
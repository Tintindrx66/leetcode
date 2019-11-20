class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null||nums.length==0){return 0;}
        Map<Integer, Integer> map=new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i)+1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}
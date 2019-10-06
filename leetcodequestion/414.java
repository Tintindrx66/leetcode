/*The idea is to avoid duplicate elements in the array and to sort them. Then less than 3 for length should return max while it would return third max values*/
class Solution {
    public int thirdMax(int[] nums) {
        
        
        if(nums==null||nums.length==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int[] output=(int[]) set.toArray(new int[set.size()]);//I got a problem in this line
        Arrays.sort(output);
        for(int i=0;i<output.length;i++){
           
              if(output.length<3){
                  return output[output.length-1];
              }else{
                  return output[output.length-3];
              }
              
              
        }
        return 0;
    }
}
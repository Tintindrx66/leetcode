//move zeroes
/*add values without 0 to arraylist and count how many 0 we need. Then 
adding number of 0 to arrylist and return result*/
class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                arr.add(nums[i]);
            }
            
        }
        for(int i=0;i<count;i++){
            arr.add(0);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
    }
}
// COMMENT FROM RAY
// As I have mentioned to you before, if you use while loop to do the binary search and get TLE,
// most likely you end up in a infinite loop
// Basically, check if your search interval is always shorter after each loop
// pay special attention to the length 2 interval case e.g. [1,2] [2,3]

//Search a 2D matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Approach1:
        /*if(matrix==null||matrix.length==0){
            return false;
        }
        
        for(int[] nums:matrix){
            if(nums==null||nums.length==0){return false;}
            int start=0;
            int end=nums.length-1;
            while(start+1<end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return true;
                }else if(nums[mid]<target){
                    start=mid;
                }else{
                    end=mid;
                }
            }
            if(nums[start]==target||nums[end]==target){
                return true;
            }
        }
        return false;*/
        
        //Approach2:
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i ++){
            if(matrix[i][0] <= target && matrix[i][col-1] >= target)
                return binarySearch(matrix[i], target);
        }
        return false;
    }
    
    public boolean binarySearch(int[] array, int target){
        int left = 0, right = array.length-1;
        while(left+1 <= right){
            int midCol = left+(right+left)/2;
            if(array[midCol] == target){
                return true;
            }
            else if(array[midCol] > target){
                right = midCol;
            }else{
                left = midCol;
            }
            if(array[left]==target||array[right]==target){
                return true;
            }    
        }
        return false;
    }
}

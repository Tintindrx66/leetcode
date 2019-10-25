//dp problem
//state: f(i) is maximum value after finishing rob before i
/*formula of state: f(i)=Math.max(f(i-1), f(i-2)+nums[i-1]). nums[i-1] means
got gold for robbing i house cause f(0)=0, f(1)=nums[0];*/ 
//exit: nums.length==0, f(0)=0, f(1)=nums[0].

class Solution {
    public int rob(int[] nums) {
        /*if(nums.length==0){
            return 0;
        } 
        if(nums.length==1){
            return nums[0];
        } 
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        } 
        if(nums.length==3){
            return Math.max(nums[0]+nums[2], nums[1]);
        } 
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[0]+nums[2];
        for(int i=3;i<nums.length;i++){
            dp[i]=Math.max(dp[i-3]+nums[i], dp[i-2]+nums[i]);
            System.out.print(" "+dp[i]);
        }
        return Math.max(dp[nums.length-1], dp[nums.length-2]);*/
        
        //Approach2:
        if(nums.length==0){
            return 0;
        }
        int[] f=new int[nums.length+1];
        f[0]=0;
        f[1]=nums[0];
        for(int i=2;i<nums.length+1;++i){
            f[i]=Math.max(f[i-1],f[i-2]+nums[i-1]);
        }
        return f[nums.length];
    }
}
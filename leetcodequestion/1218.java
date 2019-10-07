class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        //brutal approach
        if(arr==null||arr.length==0||arr.length==1){
            return 0;
        }
        int count=1;
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){//10^10>10^9 ETL error
                if(arr[j]==arr[i]+difference){
                    count++;
                    arr[i]=arr[j];
                }
                
            }
            output.add(count);
            count=1;
        }
        int longestsubsequence=0;
        for(int i=0;i<output.size();i++){
            longestsubsequence=Math.max(longestsubsequence, output.get(i));
        }
        return longestsubsequence;
        
        
    }
}
class Solution {
    public int missingNumber(int[] arr) {
        if(arr==null||arr.length==0){return 0;}
        int rule=(arr[arr.length-1]-arr[0])/arr.length;
        System.out.println(rule);
        for(int i=0;i<arr.length;++i){
            for(int j=i+1;j<arr.length;++j){
                if(arr[i]+rule!=arr[j]){
                    return arr[i]+rule;
                }else{
                    break;
                }
            }
        }
        return 0;
    }
}
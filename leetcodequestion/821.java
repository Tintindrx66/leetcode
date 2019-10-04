/*use two pointers to traversal each char from left to right and from right to left respectively in S */ 
/*For example, String="love" C="e". So for the first loop, it returns [0 1 2 0] while return [3 2 1 0] in the second loop. Also, it got outputs via Math.min function*/
class Solution {
    public int[] shortestToChar(String S, char C) {
        if(S==null||S.length()==0){
            return null;
        }
        int[] output=new int[S.length()];
        int origin=0;
        for(int i=0;i<S.length();++i){
            if(S.charAt(i)==C){
                origin=i;
            }
            output[i]=i-origin;
        }
        origin=Integer.MAX_VALUE;
        for(int i=S.length()-1;i>=0;--i){
            if(S.charAt(i)==C){
                origin=i;
            }
            output[i]=Math.min(output[i], origin-i);
        }
        return output;
    }
}
/*why I got wrong values when return output? Is any wrong to set a value for origin or something?*/
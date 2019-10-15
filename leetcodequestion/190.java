//Reverse bit
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n==0){return 0;}
        char[] res=new char[32];
        res=Integer.toBinaryString(n).toCharArray();
        
        int start=0;
        int end=res.length-1;
        while(start<=end){
            char temp=res[start];
            res[start]=res[end];
            res[end]=temp;
            start++;
            end--;
        }
        
        int result=Integer.parseInt(String.valueOf(res),2);
        result=result<<32-res.length;
        System.out.print(" "+result);
        return result;
    }
}
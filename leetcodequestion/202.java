
class Solution {
    public boolean isHappy(int n) {
        if(n==0){return true;}
        int digit=0;
        while(n>0){
            digit+=(n%10)*(n%10);
            n=n/10;
            isHappy(digit);
            if(digit==1){
                return true;
            }
            
        }
        
        return false;
    }
}
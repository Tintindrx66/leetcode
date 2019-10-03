/*ugly number*/
/*The idea of checking whether one given number is ugly or not is to divide 2,3,5 and return tree until this number is equal to 1 in the last. */
/*First: consider special case when num is 0 and 1*/
/*Second: num divide factors all the time until num is equal to 1 when the num can divide factors 2,3,5. it would return tree if num is lastly equal to 1 otherwise return false*/
class Solution {
    public boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }
        int[] factors={2,3,5};
        for(int factor: factors){
            while(num%factor==0){
                num/=factor;
                if(num==1){
                    return true;
                }
            }
        }
        
        return false;
    }
}
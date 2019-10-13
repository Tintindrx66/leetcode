/*The idea is to use two references that firstly check elements of head 
and tail, which both goes mid step by step. If two chars were not 
equal each other, using helper function would check rest of substring via
deleting one of left or right values, finally judging whether this 
palindrome is valid.*/
class Solution {
    public boolean validPalindrome(String s) {
        int a=0;
        int b=s.length()-1;
        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return helper(s, a+1, b)||helper(s, a, b-1);
            }
            a++;
            b--;
        }
        return true;
    }
    private boolean helper(String s, int i, int j){
        int a=i;
        int b=j;
        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
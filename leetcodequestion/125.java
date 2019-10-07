# use stack push and pop
class Solution {
    public boolean isPalindrome(String s) {
        
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        String p=" ";
        while(!stack.isEmpty()){
            p+=stack.pop();
        }
        return s.equals(p);
    }
}
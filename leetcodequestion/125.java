class Solution {
    public boolean isPalindrome(String s) {
        
        String q="";
        String p="";
        
        char[] ch=s.toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
                q+=c;
            
            }
        }
        
      
        
        
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<q.length();i++){
            stack.push(q.charAt(i));
        }
        
        
        while(!stack.isEmpty()){
            p+=stack.pop();
        }
        return q.equals(p);
      
    }
}
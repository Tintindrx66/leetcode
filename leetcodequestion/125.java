class Solution {
    public boolean isPalindrome(String s) {
        
        String q="";
        //String p="";
        
        char[] ch=s.toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
                q+=c;
            
            }
        }
        char[] cha=new char[q.length()];
      
        
        //approach1
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<q.length();i++){
            stack.push(q.charAt(i));
            
        }
        for(int i=0;i<q.length();i++){
            
            cha[i]=stack.pop();
            
        }
        p=String.valueOf(cha);
        
        
        return q.equals(p);
        //approach2:
        /*for(int i=0;i<q.length()/2;++i){
            if(q.charAt(i)!=q.charAt(q.length()-i-1)){
                return false;
            }
        }
        return true;*/
      
    }
}
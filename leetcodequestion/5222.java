class Solution {
    public int balancedStringSplit(String s) {
        if(s==null||s.length()==0){return 0;}
        int count=0;
        
        Stack<Character> stack=new Stack<>();
        //stack.push(s.charAt(0));
        /*for(int i=1;i<s.length();i++){
            stack.push(s.charAt(i));
            char top=stack.peek();
            if(top!=s.charAt(i+1)){
                stack.pop();
                if(stack.isEmpty()){
                    count++;
                }
                
            }    
        }*/
        /*for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                stack.push(s.charAt(i));
                if(s.charAt(i)!=s.charAt(j)){
                    stack.pop();
                    if(stack.isEmpty()){
                        count++;
                    }
                    i++;
                    j++;
                }
            }
        }*/
        for(char c: s.toCharArray()){
            if(stack.isEmpty()||stack.peek()==c){
                stack.push(c);
            }else{
                stack.pop();                             
            }
            
            if(stack.isEmpty()){
                count++;  
            } 
        }
        
        return count;
    }
}
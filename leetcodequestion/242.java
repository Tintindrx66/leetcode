
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(char c:s.toCharArray()){
            if(c>='a'&&c<='z'){
                count1[c-'a']++;
            }
        }
        for(char c:t.toCharArray()){
            if(c>='a'&&c<='z'){
                count2[c-'a']++;
            }
        }
        for(int i=0;i<count1.length;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
        
    }
}
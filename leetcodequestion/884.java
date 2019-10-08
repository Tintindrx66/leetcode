/* The idea is to concat two Strings and then throw out substrings that come out
 more than twice. Deleting them and keep single strings.*/
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        if(A==null&&B==null){
            return null;
        }
        String C=A.concat(" "+B);
        String[] SubC=C.split(" ");
        
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<SubC.length;++i){
            arr.add(SubC[i]);
        }
        
        for(int i=0;i<SubC.length;++i){
            for(int j=i+1;j<SubC.length;++j){
                if(SubC[i]==SubC[j]){
                    
                    arr.remove(SubC[j]);
                }
                arr.remove(SubC[i]);
            }
        }
        String[] output={""};
        for(int i=0;i<arr.size();i++){
            output+=arr.get(SubC[i]);
        }
        return output;
        
    }
}
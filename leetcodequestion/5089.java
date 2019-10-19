/*find all effective time slots with duration and return same time slots
for those two slots*/
class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        if(slots1==null||slots1.length==0||slots2==null||slots2.length==0){return null;}
        List<Integer> res=new ArrayList<>();
        List<Integer> s1=new ArrayList<>();
        List<Integer> s2=new ArrayList<>();
        for(int i=0;i<slots1.length;++i){
            for(int j=0;j<2;++j){
                if(slots1[i][0]+duration<=slots1[i][1]){
                    slots1[i][1]=slots1[i][0]+duration;
                    s1.add(slots1[i][j]);
                }
            }   
        }
        for(int i=0;i<slots2.length;++i){
            for(int j=0;j<2;++j){
                if(slots2[i][0]+duration<=slots2[i][1]){
                    slots2[i][1]=slots2[i][0]+duration;
                    s2.add(slots2[i][j]);
                }
            }   
        }
        int maxlength=Math.max(s1.size(), s2.size());
        for(int i=0;i<maxlength;++i){
            if(s1.get(i)==s2.get(i)){
                res.add(s1.get(i));
                return res;
            }
        }
        return null;
    }
}
/*daily temperatures*/
/*It finds the first temperature that is larger than that in one day. If temperature is
lower than the previous, it would count one until meeting a higher temperature
. Also we need to judge whether no any other temperatures are highter
than the compared one. For the question example [73,74,75,71,69,72,76,73],
there is no higher temperatures compared with 76, thus causing count=0*/

/*use two references, one count, int[] res, two loops for comparsion*/
class Solution {
    public int[] dailyTemperatures(int[] T) {
        if(T==null||T.length==0){return null;}
        
        int count=0;
        int[] res=new int[T.length];
        
        for(int i=0;i<T.length;++i){
            res[i]=0;
            for(int j=i+1;j<T.length;++j){
                if(T[i]<T[j]){
                    count++;
                    break;
                }else{
                    count++;
                    if(j==T.length-1&&T[i]>=T[j]){
                        count=0;
                    }
                }    
            }
            
            res[i]=count;
            count=0;
        }
        return res;
    }
}
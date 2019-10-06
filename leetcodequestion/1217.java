class Solution {
    public int minCostToMoveChips(int[] chips) {
        
         /*int cost=0;
        int[] costarr=new int[chips.length];
        if(chips==null||chips.length==0||chips.length==1){
            return 0;
        }
        for(int i=0;i<chips.length;i++){
            for(int j=0;j<chips.length;j++){
                
                if((Math.abs(chips[j]-chips[i])%2==1)&&(chips[i]!=chips[j])){
                    cost++;
                } 
                for(int k=0;k<costarr.length;k++){
                    costarr[k]=cost;
                }
                                               
            }
            cost=0;
            
        }
        Arrays.sort(costarr);
        return costarr[0];*/
        
        int odd=0;
        int even=0;
        for(int i=0;i<chips.length;i++){
            if(chips[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd,even);
    }
}
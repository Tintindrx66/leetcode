class Solution {
    public int minCostToMoveChips(int[] chips) {
        
        int cost=0;
        int[] costarr=new int[chips.length];
        if(chips==null||chips.length==0||chips.length==1){
            return 0;
        }
        for(int i=0;i<chips.length;i++){
            for(int j=0;j<chips.length;j++){
                
                if((Math.abs(j-i)%2==1)&&(chips[i]!=chips[j])){//odd distance +1
                    cost++;
                } 
                for(int k=0;k<costarr.length;k++){//store costs for each position
                    costarr[k]=cost;
                }
                
                            
            }
            cost=0;//set 0 after this position
            
        }
        Arrays.sort(costarr);
        return costarr[0];
    }
}
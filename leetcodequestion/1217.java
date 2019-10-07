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
        
        
        
        //Approach1:
        /*int odd=0;
        int even=0;
        for(int i=0;i<chips.length;i++){
            if(chips[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd,even);*/
        
        //Approach2:
        int cost=0;
        int[] count=new int[chips.length];
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<chips.length;i++){
            count[i]++;//count number of each element into a new array
            for(int j=i+1;j<count.length;j++){
                if(count[j]%2==0){
                    cost++;
                    cost*=count[j];
                }
                          
            }
            arr.add(cost);//store each cost into ArrayList
            cost=0;      
        }
        for(int i=0;i<arr.size();i++){
            min=Math.min(min, arr.get(i));//aquire a minimum value
        }
        
        return min;
    }
}
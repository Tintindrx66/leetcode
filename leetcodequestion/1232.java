/*
 * Ray's comment:
 * It's a brilliant idea to use cross product to check if 3 points are on the same line
 * 
 * for this specific problem, it is possiblt to do it in O(n),
 * can you try?
 */
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates==null||coordinates.length==0){return false;}
        
        int y=coordinates[coordinates.length-1][1]-coordinates[0][1];
        int x=coordinates[coordinates.length-1][0]-coordinates[0][0];
            
        for(int i=0;i<coordinates.length;++i){
            for(int j=i+1;j<coordinates.length;++j){
                if(((coordinates[i][1]-coordinates[j][1])*x)!=(coordinates[i][0]-coordinates[j][0])*y){
                   return false; 
                }else{
                    break;
                }
            }  
        }
        return true;
    }
}

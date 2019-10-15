/*taversal grid and use bfs to search*/
class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid[0]==null||grid.length==0||grid[].length==0){
            return 0;
        }
        boolean[][] seen=new boolean[grid.length][grid[].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[].length;j++){
                if(seen==false&&grid[i][j]=='1'){
                    seen=true;
                    count++;
                   // bfs process
                }
                
            }
        }
        return count;
    }
    private void bfs(int row, int column, boolean[][] seen, char[][] grid){
        
    }
}
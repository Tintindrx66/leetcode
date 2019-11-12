class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;++i){
            if(n%2==0){
                for(int j=0;j<n/2;++j){
                    int temp1=matrix[n-1-j][i];
                    matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                    matrix[j][n-1-i]=matrix[i][j];
                    matrix[i][j]=temp1;
                }
            }else{
                for(int k=0;k<n/2+1;++k){
                    int temp2=matrix[n-1-k][i];
                    matrix[n-1-k][i]=matrix[n-1-i][n-1-k];
                    matrix[n-1-i][n-1-k]=matrix[k][n-1-i];
                    matrix[k][n-1-i]=matrix[i][k];
                    matrix[i][k]=temp2;
                }
            }
        }
    }
}
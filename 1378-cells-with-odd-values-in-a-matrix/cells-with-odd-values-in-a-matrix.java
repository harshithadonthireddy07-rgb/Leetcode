class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int mat[][]=new int[m][n];
        for(int[] index : indices){
            int row=index[0];
            int col=index[1];
            for(int i=0 ; i<n ;i++){
                mat[row][i]++;
            }
             for(int i=0 ; i<m ;i++){
                mat[i][col]++;
            }
        }
        int count=0;
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if (mat[i][j]%2 != 0){
            count++;
        }
    }
}
        
return count;        
    }
}
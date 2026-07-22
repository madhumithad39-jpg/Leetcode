class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int count =0;int rSize=grid.length,cSize = grid[0].length;
        for(int row=0;row<rSize;row++)
            for(int col=0;col<cSize;col++)
                if(grid[row][col]=='1'){
                   count++;
                   dTrav(grid, row, col);
                }
        return count;
    }
    public static void dTrav(char[][] mat, int row, int col){
        int rSize = mat.length, cSize = mat[0].length;
        if(row<0||col<0||row>=rSize||
            col>=cSize||mat[row][col]=='0') return;
        mat[row][col]='0';dTrav(mat, row-1, col);
        dTrav(mat, row+1, col);
        dTrav(mat, row, col-1);dTrav(mat, row, col+1);
    }
}
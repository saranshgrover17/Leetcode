class Solution {
    public static int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] check = new boolean[m][n];
        int i = 0 ;
        int j = 0 ;
        int row = 0 ;
        int col = 0;
        while(i>=0 && i<m && j>=0 && j<n && !check[i][j]){
            row = i;
            col = j;
            check[i][j] = true;
            if(grid[i][j]=='R'){
                j++;
            }
            else if(grid[i][j]=='D'){
                i++;
            }
            else if(grid[i][j]=='L'){
                j--;
            }
            else if(grid[i][j]=='U'){
                i--;
            }
        }
        return new int[]{row,col};
    }
}
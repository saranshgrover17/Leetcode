class Solution {
    public static int countServers(int[][] grid) {
        int ans = 0;
        boolean[][] copy = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
            if (count != 1) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        copy[i][j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            int count = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) {
                    count++;
                }
            }
            if (count != 1) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][i] == 1) {
                        copy[j][i] = true;
                    }
                }
            }
        }
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(copy[i][j]==true){
                    ans++;
                }
            }
        }
        return ans;
    }
}
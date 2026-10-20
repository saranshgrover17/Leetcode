class Solution {
    public static int[] lastVisitedCell(char[][] grid) {
        int[] arr = {0,0};
        boolean[][] check = new boolean[grid.length][grid[0].length];
        check[arr[0]][arr[1]] = true;
        while(true){
            if(grid[arr[0]][arr[1]]=='R'){
                if( arr[1]+1 == grid[0].length || check[arr[0]][arr[1]+1]==true){
                    break;
                }
                arr[1] = arr[1] + 1;
                check[arr[0]][arr[1]] = true;
            }
            else if(grid[arr[0]][arr[1]]=='D'){
                if( arr[0]+1 == grid.length || check[arr[0]+1][arr[1]]==true){
                    break;
                }
                arr[0] = arr[0] + 1;
                check[arr[0]][arr[1]] = true;
            }
            else if(grid[arr[0]][arr[1]]=='L'){
                if(arr[1]-1 == -1 || check[arr[0]][arr[1]-1]==true ){
                    break;
                }
                arr[1] = arr[1] - 1;
                check[arr[0]][arr[1]] = true;
            }
            else if(grid[arr[0]][arr[1]]=='U'){
                if(arr[0]-1 == -1 || check[arr[0]-1][arr[1]]==true ){
                    break;
                }
                arr[0] = arr[0] - 1;
                check[arr[0]][arr[1]] = true;
            }
        }
        return arr;
    }
}
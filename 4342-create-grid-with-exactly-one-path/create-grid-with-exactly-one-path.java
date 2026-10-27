class Solution {
    public static String[] createGrid(int m, int n) {
        boolean[][] check = new boolean[m][n];
        String s[] = new String[m];

        for(int i = 0 ; i < n ; i++){
            check[0][i] = true;
        }
        for(int i = 0 ; i < m ; i++){
            check[i][n-1] = true;
        }
        for(int i = 0 ; i < m ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < n ; j++){
                if(check[i][j]==true){
                    sb.append('.');
                }
                else {
                    sb.append('#');
                }
            }
            s[i] = sb.toString();
        }
        return s;
    }
}
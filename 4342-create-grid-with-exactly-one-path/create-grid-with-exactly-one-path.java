class Solution {
    public static String[] createGrid(int m, int n) {
        char[][] ch = new char[m][n];
        String s[] = new String[m];

        for (int i = 0; i < m; i++) {
            Arrays.fill(ch[i], '#');
        }

        Arrays.fill(ch[0], '.');

        for (int i = 1; i < m; i++) {
            ch[i][n - 1] = '.';
        }

        for (int i = 0; i < m; i++) {
            s[i] = new String(ch[i]);
        }

        return s;
    }
}
class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0 ;
        Arrays.sort(s);
        Arrays.sort(g);
        int i = 0 ;
        int j = 0;

        while(i<g.length && j < s.length){
            if(s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
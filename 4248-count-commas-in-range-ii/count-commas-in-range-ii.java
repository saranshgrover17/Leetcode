class Solution {
    public static long countCommas(long n) {

        if (n < 1000) {
            return 0;
        }
        int comma = 1;
        long ans = 0;
        long lower = 1000;

        while(lower<=n){
            long upper = (lower * 1000 )-1;
            if(upper>n){
                upper = n;
            }
            long count_no = upper - lower + 1;
            ans = ans + (count_no*comma);

            lower = lower * 1000;
            comma++;
        }

        return ans;
    }
}
class Solution {
    public static int minimumPushes(String s) {
        int ans = 0 ;
        int n = s.length();
        int count = 1;
        while(n!=0){
            if(n>8){
                ans = ans + (count*8);
                n = n - 8 ;
                count++;
            }
            else {
                ans = ans + (count*n);
                n = 0 ;
            }
        }
        return ans;
    }
}
class Solution {
    public static boolean productcheck(int ans,int t){
        int prod = 1;
        while(ans!=0){
            int ld = ans%10;
            prod = prod * ld;
            ans = ans /10;
        }
        return (prod%t==0);
    }

    public static int smallestNumber(int n, int t) {
        int ans = n;
        while(true){
            if(productcheck(ans, t)){
                break;
            }
            ans++;
        }
        return ans;
    }
}
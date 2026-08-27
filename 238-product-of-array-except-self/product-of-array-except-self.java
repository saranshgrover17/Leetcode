class Solution {
    public static int[] productExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];
        int prod = 1;
        int zcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zcount++;
            }
        }
        int idx = 0;
        if (zcount > 1) {
            return ans;
        } else if (zcount == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    prod = prod * arr[i];
                    ans[i] = 0;
                }
                if(arr[i]==0){
                    idx = i;
                }
            }
            ans[idx] = prod;
            return ans;
        }
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = prod / arr[i];
        }
        return ans;
    }
}
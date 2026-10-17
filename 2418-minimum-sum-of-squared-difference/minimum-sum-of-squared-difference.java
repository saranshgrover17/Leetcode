class Solution {
    public static long minSumSquareDiff(int[] arr1, int[] arr2, int k1, int k2) {
        long k = (long) k1 + k2;
        long ans = 0;
        int[] diff = new int[100001];
        long tot_diff = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(arr1[i] - arr2[i]);
            tot_diff = tot_diff + arr1[i];
            diff[arr1[i]]++;
            max = Math.max(max, arr1[i]);
        }
        if (tot_diff <= k) {
            return 0;
        }

        for (int i = max; i >= 1; i--) {
            if (k == 0) {
                break;
            }
            int moves = (int) Math.min(k, diff[i]);
            diff[i - 1] += moves;
            diff[i] -= moves;
            k -= moves;
        }

        for (int i = 1; i <= max; i++) {
            ans = ans + (long)i * i * diff[i];
        }

        return ans;
    }
}
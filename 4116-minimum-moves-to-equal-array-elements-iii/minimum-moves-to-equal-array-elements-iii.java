class Solution {
    public static int minMoves(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans + (max - arr[i]);
        }
        return ans;
    }
}
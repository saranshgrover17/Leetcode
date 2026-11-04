class Solution {
    public static int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        //1,2,9,10
        int mid = (arr.length)/2;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.abs(arr[mid]-arr[i]);
        }
        return ans;
    }
}
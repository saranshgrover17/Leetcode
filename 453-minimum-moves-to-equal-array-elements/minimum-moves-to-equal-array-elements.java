class Solution {
    public static int minMoves(int[] arr) {
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            min = Math.min(min, arr[i]);
        }
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            ans = ans + (arr[i]-min);
        }
        return ans;
    } 
}
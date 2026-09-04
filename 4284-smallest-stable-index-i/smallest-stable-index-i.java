class Solution {
    public static int firstStableIndex(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] maxx = new int[arr.length];
        int[] minn = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            maxx[i] = Math.max(max, arr[i]);
            max = Math.max(max, arr[i]);
        }
        for(int i = arr.length-1 ; i >=0 ; i--){
            minn[i] = Math.min(min,arr[i]);
            min = Math.min(min,arr[i]);
        }

        for(int i = 0 ; i < maxx.length ; i++){
            if((maxx[i]-minn[i])<=k){
                return i;
            }
        }
        return -1;
    }
}
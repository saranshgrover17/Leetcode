class Solution {
    public static int[] productExceptSelf(int[] arr) {
        // int[] ans = new int[arr.length];
        
        int[] left = new int[arr.length];
        // int[] right = new int[arr.length];

        left[0] = 1;
        for(int i = 1 ; i < arr.length ; i++){
            left[i] = left[i-1] * arr[i-1];
        }

        // right[arr.length-1] = 1;

        int j = 1;
        for(int i = arr.length-1 ; i >=0 ; i--){
            left[i] = left[i] * j;
            j = j * arr[i];
        }

        // for(int i = 0 ; i < arr.length ; i++){
        //     ans[i] = left[i]*right[i];
        // }

        return left;
    }
}
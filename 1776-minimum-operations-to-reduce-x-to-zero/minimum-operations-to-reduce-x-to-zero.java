class Solution {
    public static int minOperations(int[] arr, int x) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int sub_sum = sum - x;
        if(sub_sum==0){
            return arr.length;
        }
        int curr = 0;
        int length = -1;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            curr = curr + arr[j];
            while(curr>sub_sum && i<=j){
                curr = curr-arr[i];
                i++;
            }
            if(curr==sub_sum){
                length = Math.max(length, j-i+1);
            }
        }
        if (length == -1) {
            return -1;
        }
        return arr.length - length;
    }
}
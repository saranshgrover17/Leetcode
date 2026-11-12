class Solution {
    public static int longestMonotonicSubarray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        //for strictly increasing 
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    count++;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, count);
        }
        //for strictly decreasing 
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    count++;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
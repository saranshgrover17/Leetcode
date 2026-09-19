class Solution {
    public static boolean isRectangleOverlap(int[] arr1, int[] arr2) {
        int w = Math.min(arr1[2], arr2[2]) - Math.max(arr1[0], arr2[0]);
        int h = Math.min(arr1[3], arr2[3]) - Math.max(arr1[1], arr2[1]);

        return w>0 && h>0;
    }
}
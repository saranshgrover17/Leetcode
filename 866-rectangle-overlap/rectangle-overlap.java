class Solution {
    public static boolean isRectangleOverlap(int[] arr1, int[] arr2) {
        int r1x1 = arr1[0];
        int r1y1 = arr1[1];
        int r1x2 = arr1[2];
        int r1y2 = arr1[3];

        int r2y1 = arr2[1];
        int r2x1 = arr2[0];
        int r2x2 = arr2[2];
        int r2y2 = arr2[3];

        if (r2x1 >= r1x2) {
            return false;
        }
        if (r2y1 >= r1y2) {
            return false;
        }
        if (r1x1 >= r2x2) {
            return false;
        }
        if (r1y1 >= r2y2) {
            return false;
        }
        return true;
    }
}
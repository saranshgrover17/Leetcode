class Solution {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1] - b[1]);
        int count = 1 ;
        int[] curr = intervals[0];
        int i = 1;
        while(i<intervals.length){
            if(intervals[i][0]>=curr[1]){
                count++;
                curr = intervals[i];
            }
            i++;
        }
        return intervals.length-count;
    }
}
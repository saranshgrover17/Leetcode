class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0 ; 

        //left
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }

        //overlap
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        list.add(new int[]{newInterval[0],newInterval[1]});
        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
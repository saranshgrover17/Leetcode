class Solution {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;

        ArrayList<int[]> list = new ArrayList<>();

        int i = 1;
        int[] current = intervals[0];
        
        while(i!=n){
            if(current[1]>=intervals[i][0]){
                current[0] = Math.min(current[0], intervals[i][0]);
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else{
                list.add(current);
                current = intervals[i];
            }
            i++;
        }

        list.add(current);

        return list.toArray(new int[list.size()][]);
    }
}
class Solution {
    public static int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int[] ans = new int[queries.length];
        int[][] q = new int[queries.length][2];
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }
        Arrays.sort(q , (a,b)->Integer.compare(a[0], b[0]));
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        int j = 0;
        int k = 0;

        for (int i = 0; i < q.length; i++) {
            int left = q[i][0] - x;
            int right = q[i][0];

            while (k < logs.length && logs[k][1] <= right) {
                mpp.put(logs[k][0], mpp.getOrDefault(logs[k][0], 0)+1);
                k++;
            }
            while (j < logs.length && logs[j][1] < left) {
                mpp.put(logs[j][0], mpp.getOrDefault(logs[j][0], 0)-1);
                if(mpp.get(logs[j][0])==0){
                    mpp.remove(logs[j][0]);
                }
                j++;
            }
            ans[q[i][1]] = n - mpp.size();
        }
        return ans;
    }
}
class Solution {
    public static int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < time.length; i++) {
            if (time[i] >= 60) {
                time[i] = time[i] % 60;
            }
        }
        for (int i = 0; i < time.length; i++) {
            if(time[i]== 0 && mpp.containsKey(0)){
                ans += mpp.get(0);
            }
            else if (mpp.containsKey(60 - time[i])) {
                ans += mpp.get(60 - time[i]);
            }
            mpp.put(time[i], mpp.getOrDefault(time[i], 0) + 1);
        }
        return ans;
    }
}
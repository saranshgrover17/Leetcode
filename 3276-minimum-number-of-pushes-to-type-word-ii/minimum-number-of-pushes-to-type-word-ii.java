class Solution {
    public static int minimumPushes(String s) {
        int ans = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);
        }
        int[] arr = new int[mpp.size()];
        int j = 0;
        for (char key : mpp.keySet()) {
            arr[j] = mpp.get(key);
            j++;
        }
        Arrays.sort(arr);
        int m = 0;
        int n = arr.length - 1;

        while (m < n) {
            int temp = arr[m] ;
            arr[m] = arr[n];
            arr[n] = temp;
            m++;
            n--;     
        }

        int count = 1;
        for (int k = 0; k < arr.length; k++) {
            if (count <= 8) {
                ans = ans + arr[k];
                count++;
            } else if (count <= 16) {
                ans = ans + 2 * arr[k];
                count++;
            } else if (count <= 24) {
                ans = ans + 3 * arr[k];
                count++;
            } else {
                ans = ans + 4 * arr[k];
                count++;
            }

        }
        return ans;
    }
}
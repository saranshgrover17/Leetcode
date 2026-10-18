class Solution {
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int minSwaps(int[] arr) {
        int swap = 0;
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        //comparator digit sum ke acc sorting karta h 
        Arrays.sort(nums, (a, b) -> {
            int sumA = sum(a);
            int sumB = sum(b);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a, b);
        });

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (nums[i] != arr[i]) {
                int j = mpp.get(nums[i]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swap++;
                mpp.put(arr[i], i);
                mpp.put(arr[j], j);
            }

        }
        return swap;
    }
}
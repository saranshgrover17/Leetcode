class Solution {
    public static int[] resultArray(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int[] result = new int[arr.length];

        arr1.add(arr[0]);
        arr2.add(arr[1]);

        int i = 0;
        int j = 0;
        int k = 2;

        while (k < arr.length) {
            if (arr1.get(i) > arr2.get(j)) {
                arr1.add(arr[k]);
                i++;
                k++;
            } else {
                arr2.add(arr[k]);
                j++;
                k++;
            }
        }
        int m = 0;
        for (int l = 0; l < arr1.size(); l++) {
            result[m] = arr1.get(l);
            m++;
        }

        for (int l = 0; l < arr2.size(); l++) {
            result[m] = arr2.get(l);
            m++;
        }
        return result;
    }
}
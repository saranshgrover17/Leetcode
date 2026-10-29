class Solution {
    public static int minOperations(int[] arr) {
        boolean inc = false;
        boolean dec = false;
        int count = 1;

        int[] newarr = new int[arr.length * 2];// 1,0,2,1,0,2

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
            newarr[i + arr.length] = arr[i];
        }
        // check increasing
        for (int i = 0; i < newarr.length - 1; i++) {
            if (newarr[i] < newarr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == arr.length) {
                inc = true;
                break;
            }
        }
        //1,2,3,4,0 -> 0,4,3,2,1 
        if (!inc) {
            count = 1;
            // check decreasing
            for (int i = 0; i < newarr.length - 1; i++) {
                if (newarr[i] > newarr[i + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == arr.length) {
                    dec = true;
                    break;
                }
            }
        }
        int ans = -1;
        //1,2,3,4,0 -> 0,4,3,2,1 
        if (inc) {
            int z_idx = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    z_idx = i;
                    break;
                }
            }

            int one = z_idx;
            int rest = arr.length - z_idx;
            int two = 2 + rest;
            ans = Math.min(one, two);
        } else if (dec) {
            int j = 0;
            int k = arr.length - 1;
            while (j < k) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;
            }
            int z_idx = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    z_idx = i;
                    break;
                }
            }
            int one = 1 + z_idx;
            j = 0;
            k = arr.length - 1;
            while (j < k) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;
            }
            z_idx = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    z_idx = i;
                    break;
                }
            }
            int two = 1 + z_idx + 1;
            ans = Math.min(one, two);
        } else {
            return -1;
        }
        return ans;
    }
}
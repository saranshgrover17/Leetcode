class Solution {
    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int nines = sum / 9;
        int rem = sum % 9;

        int count = 0;
        while (count != num) {
            if (nines > 0 && count != num) {
                for (int i = 0; i < nines; i++) {
                    sb.append('9');
                    count++;
                }
            }
            if (rem > 0 && count != num) {
                sb.append(Integer.toString(rem));
                count++;
            }
            if (num - count != 0 && count != num) {
                for (int i = 0; i < num - count; i++) {
                    sb.append('0');
                }
            }
            break;
        }
        return sb.toString();
    }
}
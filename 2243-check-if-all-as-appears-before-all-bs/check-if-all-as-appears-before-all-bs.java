class Solution {
    public static boolean checkString(String s) {
        boolean check = false;
        int idx_b = s.indexOf('b');
        if (idx_b == -1) {
            return true;
        }
        for (int i = idx_b + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                check = true;
            }
        }
        if (check) {
            return false;
        }
        return true;
    }
}
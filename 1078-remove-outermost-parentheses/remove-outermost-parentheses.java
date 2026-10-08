class Solution {
    public static String removeOuterParentheses(String s) {
        int left = 0;
        int right = 0;
        int start = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else if (s.charAt(i) == ')') {
                right++;
            }
            if (left == right) {
                for (int j = start + 1; j < i; j++) {
                    sb.append(s.charAt(j));
                }
                start = i + 1;
            }
        }
        return sb.toString();
    }
}
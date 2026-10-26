class Solution {
    public static int minOperations(String s) {
        if (s.length() == 1) {
            return 0;
        } else if (s.length() == 2) {
            if (s.charAt(0) <= s.charAt(1)) {
                return 0;
            } else {
                return -1;
            }
        } else {
            char minChar = '{';
            char maxChar = 'a';
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < minChar) {
                    minChar = s.charAt(i);
                }
                if (s.charAt(i) > maxChar) {
                    maxChar = s.charAt(i);
                }
            }
            if (minChar == s.charAt(0) && maxChar == s.charAt(s.length() - 1)) {
                char[] ch = s.substring(1, s.length() - 1).toCharArray();
                Arrays.sort(ch);
                String nn = new String(ch);
                if (nn.equals(s.substring(1, s.length() - 1))) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (minChar == s.charAt(0) || maxChar == s.charAt(s.length() - 1)) {
                return 1;
            } else if (s.charAt(0) == maxChar && s.charAt(s.length() - 1) == minChar
                    && s.indexOf(minChar) == s.length() - 1 && s.lastIndexOf(maxChar) == 0) {
                return 3;
            } else {
                return 2;
            }
        }
    }
}
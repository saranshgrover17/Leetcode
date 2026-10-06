class Solution {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } else {
                int inside = st.pop();
                int score = 0;
                if (inside == 0) {
                    score = 1;
                } else {
                    score = 2 * inside;
                }
                if (st.empty()) {
                    st.push(score);
                } else {
                    st.push(st.pop() + score);
                }
            }
            i++;
        }
        return st.peek();
    }
}
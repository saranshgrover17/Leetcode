class Solution {
    public static String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();
        Queue<Character> q = new java.util.LinkedList<>();
        

        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)==')'){
                while(st.peek()!='('){
                    q.add(st.pop());
                }
                st.pop();
                while(!q.isEmpty()){
                    st.add(q.poll());
                }
            }
            else {
                st.add(s.charAt(i));
            }
            i++;
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
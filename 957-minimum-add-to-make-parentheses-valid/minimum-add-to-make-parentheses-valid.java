class Solution {
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0 ;
        int ans = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if(!st.empty() && st.peek()=='('){
                    st.pop();
                }
                else {
                    st.push(s.charAt(i));
                }
            }   
            i++;
        }
        return st.size();
    }
}
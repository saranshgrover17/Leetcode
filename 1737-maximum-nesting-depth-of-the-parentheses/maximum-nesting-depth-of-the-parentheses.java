class Solution {
    public static int maxDepth(String s) {
        int count = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
            if(count>max){
                max = count;
            }
        }
        return max;
    }
}
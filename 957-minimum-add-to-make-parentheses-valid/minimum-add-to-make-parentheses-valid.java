class Solution {
    public static int minAddToMakeValid(String s) {
        int open = 0 ;
        int close = 0;        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='('){
                close++;
            }
            else {
                if(close>0){
                    close--;
                }
                else{
                    open++;
                }
            }
        }
        return open+close;
    }
}
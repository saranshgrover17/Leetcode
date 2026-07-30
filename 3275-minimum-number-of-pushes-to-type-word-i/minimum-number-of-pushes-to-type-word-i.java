class Solution {
    public static int minimumPushes(String s) {
        int n = s.length();
        int count = 0;

        if(n<=8){
            count =  n;
        }
        else if(n<=16){
            count =  (8 + 2*(n-8));
        }
        else if(n<=24){
            count =  (24 +3*(n-16));
        }
        else{
            count =  (48 + 4*(n-24));
        }
        return count;
    }
}
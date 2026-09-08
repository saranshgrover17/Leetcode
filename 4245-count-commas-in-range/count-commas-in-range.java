class Solution {
    public static int countCommas(int n) {
        int copy = n ;
        int count = 0;
        while(copy!=0){
            copy = copy/10;
            count++;
        }
        if(count<=3){
            return 0;
        }
        return n - 1000 + 1;
    }
}
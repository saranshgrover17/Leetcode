class Solution {
    public static boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int stone = 10;
        int count = 0;
        while(true){
            if(n>=stone){
                n = n - stone;
            }
            else{
                count--;
                break;
            }
            stone--;
            count++;
        }
        if(count%2!=0){
            return false;
        }
        return true;
    }
}
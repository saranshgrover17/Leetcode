class Solution {
    public static boolean canJump(int[] arr) {
        int maxidx = 0;
        int sum = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(i>maxidx){
                return false;
            }
            if((i+arr[i])>maxidx){
                maxidx = i + arr[i];
            }
        }
        return true;
    }
}
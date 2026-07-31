class Solution {
    public static boolean canJump(int[] arr) {
        int finalpos = arr.length -1 ;
        for(int i = arr.length-2 ; i >= 0 ; i--){
            if(i+arr[i]>=finalpos){
                finalpos = i;
            }
        }
        if(finalpos==0){
            return true;
        }
        return false;
    }
}
class Solution {
    public static boolean uniformArray(int[] arr) {
        int minel = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            minel = Math.min(minel, arr[i]);
        }
        if(minel%2!=0){
            return true;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2==1){
                return false;
            }
        }
        return true;
    }
}
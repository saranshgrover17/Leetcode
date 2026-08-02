class Solution {
    public static int jump(int[] arr) {
        int count = 0;
        int end = 0;
        int maxreach = 0;

        if(arr.length == 1){
            return 0;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(i+arr[i]>maxreach){
                maxreach = i + arr[i];
            }
            if(i == end){
                count++;
                end = maxreach;
                if(maxreach==arr.length-1){
                    return count;
                }
            }
            
        }
        return count ;
    }
}
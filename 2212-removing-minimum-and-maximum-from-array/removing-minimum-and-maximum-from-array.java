class Solution {
    public static int minimumDeletions(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxidx = 0;

        int min = Integer.MAX_VALUE;
        int minidx = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
                maxidx = i;
            }
            if(arr[i]<min){
                min = arr[i];
                minidx = i;
            }
        }
        int left = Math.max(maxidx, minidx)+1;
        int right = arr.length - Math.min(maxidx, minidx);
        int both = Math.min(maxidx, minidx)+1 + arr.length - Math.max(maxidx, minidx);

        return Math.min(both, Math.min(left, right));
    }
}
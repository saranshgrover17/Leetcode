class Solution {
    public static int minOperations(int[] arr, int x) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int sum = 0;
        int length = -1;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        int prefix = 0;
        for(int i = 0 ; i < arr.length ; i++){
            prefix = prefix+arr[i];
            mpp.put(prefix,i);
            if(prefix==sum-x){
                length = Math.max(length, i+1);
            }
            else if(prefix>sum-x){
                if(mpp.containsKey(prefix-(sum-x))){
                    length = Math.max(length, i-mpp.get(prefix-(sum-x)));
                }
            }
        }
        if(length == -1){
            return -1;
        }
        return arr.length-length;
    }
}
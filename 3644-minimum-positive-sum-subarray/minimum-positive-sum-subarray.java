class Solution {
    public static int minimumSumSubarray(List<Integer> arr, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.size() ; i++){
            int length = 0;
            int sum = 0;
            for(int j = i ; j < arr.size() ; j++){
                length++;
                sum = sum + arr.get(j);
                if(length>=l && length<=r && sum>0){
                    ans = Math.min(ans, sum);
                }
                else if (length>r){
                    break;
                }
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
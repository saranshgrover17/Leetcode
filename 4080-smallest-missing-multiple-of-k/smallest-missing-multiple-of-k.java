class Solution {
    public static int missingMultiple(int[] arr, int k) {
        HashSet <Integer> set = new HashSet<>();
        int ans = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        for(int i = 1 ; i <= 1000 ; i++){
            if(!set.contains(k*i)){
                ans = k*i;
                break;
            }
        }
        return ans;
    }
}
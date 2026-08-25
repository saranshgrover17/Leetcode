class Solution {
    public static int missingMultiple(int[] arr, int k) {
        HashSet <Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        // for(int i = 1 ; i <= 10 ; i++){
        //     if(!set.contains(k*i)){
        //         ans = k*i;
        //         break;
        //     }
        // }
        int ans = k ;

        while(set.contains(ans)){
            ans = ans + k ;
        }
        
        return ans;
    }
}
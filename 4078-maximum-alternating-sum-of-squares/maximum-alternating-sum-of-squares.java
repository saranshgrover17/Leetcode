class Solution {
    public static long maxAlternatingSum(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        int j = 0 ;
        int k = arr.length - 1;
        while(j<k){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        long ans = 0L;
        int n = arr.length;
        int pos = 0;
        if(n%2==0){
            pos = n/2;
        }
        else {
            pos = (n/2)+1;
        }

        for(int i = 0 ; i < n ; i++){
            if(i<pos){
                ans = ans + arr[i]*arr[i];
            }
            else {
                ans = ans - arr[i]*arr[i];
            }
        }
        return ans;
    }
}
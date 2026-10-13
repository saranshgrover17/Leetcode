class Solution {
    public static long maxAlternatingSum(int[] arr) {
        Integer[] arrr = new Integer[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            arrr[i] = arr[i];
        }
        long ans = 0;
        Arrays.sort(arrr , (a,b)->Integer.compare(Math.abs(b), Math.abs(a)));
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
                ans = ans + arrr[i]*arrr[i];
            }
            else {
                ans = ans - arrr[i]*arrr[i];
            }
        }
        return ans;
    }
}
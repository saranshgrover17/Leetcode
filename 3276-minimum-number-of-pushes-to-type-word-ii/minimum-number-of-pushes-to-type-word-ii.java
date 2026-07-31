class Solution {
    public static int minimumPushes(String s) {
        int ans = 0;
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int count = 1;
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(count<=8){
                ans = ans + arr[i];
                count++;
            }
            else if (count<=16){
                ans = ans + 2*arr[i];
                count++;
            }
            else if (count<=24){
                ans = ans + 3*arr[i];
                count++;
            }
            else {
                ans = ans + 4*arr[i];
                count++;
            }
        }
        return ans;
    }
}
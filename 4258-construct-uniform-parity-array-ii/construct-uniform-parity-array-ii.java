class Solution {
    public static boolean uniformArray(int[] arr) {
        int minodd = Integer.MAX_VALUE;
        int mineven = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2==0){
                mineven = Math.min(mineven, arr[i]);
            }
            else if(arr[i]%2!=0){
                minodd = Math.min(minodd, arr[i]);
            }
        }
        if(minodd == Integer.MAX_VALUE||mineven == Integer.MAX_VALUE){
            return true;
        }
        if(minodd<mineven){
            return true;
        }
        return false;
    }   
}
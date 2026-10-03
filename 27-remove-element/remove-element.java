class Solution {
    public static int removeElement(int[] arr, int val) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i<j && arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i++;
        }
        int count = 0;

        for(int k = 0 ; k < arr.length ; k++){
            if(arr[k]==val){
                break;
            }
            count++;
        }
        
        return count;
    }
}
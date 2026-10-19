class Solution {
    // public static List<Integer> targetIndices(int[] arr, int target) {
    //     List<Integer> list = new ArrayList<>();
    //     Arrays.sort(arr);
    //     for(int i = 0 ; i < arr.length ; i++){
    //         if(arr[i]==target){
    //             list.add(i);
    //         }
    //     }
    //     return list;
    // }
    public static List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        int lesscount = 0;
        int equal = 0;
        int idx_bef_target = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<target){
                lesscount++;
            }
            else if(arr[i] == target){
                equal++;
            }
        }
        idx_bef_target = lesscount;
        for(int i = 0 ; i < equal ; i++){
            list.add(idx_bef_target+i);
        }
        return list;
    }
}
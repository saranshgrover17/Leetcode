class Solution {
    public static List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        boolean[] arr = new boolean[101];
        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]] = true;
        }
        for(int i = min ; i <=max ; i++){
            if(arr[i]==false){
                list.add(i);
            }
        }
        return list;
    }
}
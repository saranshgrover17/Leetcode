class Solution {
    public static List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        Arrays.sort(nums);
        int i = 0 ;
        while(min<=max){
            while(nums[i]!=min){
                list.add(min);
                min++;
            }
            i++;
            min++;
        }
        return list;
    }
}
class Solution {
    public static List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        for(int i = min ; i <=max ; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
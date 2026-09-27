class Solution {
    public int smallestIndex(int[] nums) {
        int ans = -1;
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            while(nums[i]!=0){
                sum = sum + nums[i]%10;
                nums[i] = nums[i]/10;
            }
            if(sum == i ){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
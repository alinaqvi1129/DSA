class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int res = 0;
        int temp = 0;
        for(int i = 0;i<nums.length - k;i++){
            temp = Math.max(nums[i],temp);
            res = Math.max(res,temp + nums[i + k]);
        }
        return res;
    }
}
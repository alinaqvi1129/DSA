class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = -1;
        int max [] = new int[nums.length];
        int min [] = new int[nums.length];
        max[0] = nums[0];
        for(int i = 1;i<nums.length;i++) max[i] = Math.max(nums[i],max[i-1]);
        min[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length - 2;i>=0;i--) min[i] = Math.min(nums[i],min[i+1]);
 
        for(int i = 0;i<nums.length;i++){
            int p = max[i] - min[i];
            if(p <= k){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
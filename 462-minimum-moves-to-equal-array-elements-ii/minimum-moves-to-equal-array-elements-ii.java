class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length) / 2;
        int ele = nums[mid];
        int c = 0;
        for(int i = 0;i<nums.length;i++){
            c+= Math.abs(nums[i] - ele);
        }
        return c;
    }
}
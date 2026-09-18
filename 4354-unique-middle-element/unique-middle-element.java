class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums[nums.length/2];
        int flag = 0;
        for(int i : nums){
           
            if(i == mid && flag == 1) return false;
            if(i == mid && flag == 0) flag = 1;
        }
        return true;
    }
}
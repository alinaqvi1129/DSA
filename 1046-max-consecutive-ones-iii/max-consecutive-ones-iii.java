class Solution {
    public int longestOnes(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int c = 0;
        int maxlen = 0;
        while(right < nums.length){
            if(nums[right] == 0 && c <= k) c++;
            if(nums[right] == 0 && c > k){
                while(nums[left] != 0)left++;
                left++;
                c--;
            }
            maxlen = Math.max(maxlen,right - left + 1);
            right++;
        }
        return maxlen;
    }
}
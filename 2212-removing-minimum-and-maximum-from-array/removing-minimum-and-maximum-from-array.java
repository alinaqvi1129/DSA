class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE,idx1 = 0;
        int max = Integer.MIN_VALUE,idx2 =0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                idx1 = i;
            }
            if(nums[i] > max){
                max = nums[i];
                idx2 = i;
            }
        }
        int n = nums.length;

    if (idx1 > idx2) {
        int temp = idx1;
        idx1 = idx2;
        idx2 = temp;
    }
    int option1 = idx2 + 1;

    int option2 = n - idx1;

    int option3 = idx1 + 1 + n - idx2;

    return Math.min(option1, Math.min(option2, option3));
    }
}
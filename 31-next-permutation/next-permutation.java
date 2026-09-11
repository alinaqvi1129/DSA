class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1)rev(nums,0,nums.length-1);
        else{
            for(int i = nums.length-1;i>=idx;i--){
                if(nums[i] > nums[idx]){
                    int t = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = t;
                    break;
                }
            }
        rev(nums,idx+1,nums.length-1);
        }
    }
    void rev(int[] arr,int left,int right){
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
}
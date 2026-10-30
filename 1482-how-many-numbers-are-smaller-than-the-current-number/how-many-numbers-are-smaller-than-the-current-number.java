class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] res = new int[nums.length];
        int[] copy = nums.clone();
        Arrays.sort(copy);
        for(int i = 0;i<res.length;i++){
           int j = 0;
           while(copy[j] != nums[i]) j++;
           res[i] = j;
        }
        return res;
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i = 0;i<nums1.length;i++){
            int j = 0;
            while(nums2[j] != nums1[i]) j++;
            j++;
            while(j < nums2.length){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}
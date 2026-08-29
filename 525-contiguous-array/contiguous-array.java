class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int [] pref = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
            if(nums[i] == 0) nums[i] = -1;

        pref[0] = nums[0];
        for(int i = 1;i<nums.length;i++) pref[i] = pref[i-1] + nums[i];
        int maxlen = 0;

        for(int i = 0;i<nums.length;i++){
            int sum = pref[i];
            if(map.containsKey(sum)) maxlen = Math.max(maxlen,i-map.get(sum));
            else map.put(sum,i);
        }
        return maxlen;
    }
}
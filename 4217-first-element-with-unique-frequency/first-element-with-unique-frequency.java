class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i : map.values()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(map2.get(map.get(i))==1)return i;
        }
        return -1;
    }
}
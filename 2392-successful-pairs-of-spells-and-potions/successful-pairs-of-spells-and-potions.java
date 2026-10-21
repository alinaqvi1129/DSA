class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        
        int ans [] = new int[spells.length];
        for(int i = 0;i<spells.length;i++){
            int left = 0;
            int right = potions.length-1;
            int c = 0;
           while(left <= right){
                int mid = left + (right - left) / 2;
                if((long)potions[mid] * spells[i] >= success){
                    c+= right - mid + 1;
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
           }
           ans[i] = c;
        }
        return ans;
    }
}
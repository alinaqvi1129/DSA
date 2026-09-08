class Solution {
    public int longestContinuousSubstring(String s) {
       int right = 0;
       int left = 0;
       int maxl = 0;
       while(right < s.length()){
            if(right - left + 1 > 1 && s.charAt(right) != s.charAt(right - 1) + 1){
                left = right;
            }
            maxl = Math.max(maxl,right - left + 1);
            right++;
       }
       return maxl;
    }
}
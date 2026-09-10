class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) set.add(ch);
        int max = 0;
        for(char ch : set){
            int right = 0;
            int left = 0;
            int c = 0;
            while(right < s.length()){
                char sh = s.charAt(right);
                if(sh != ch) c++;
                while(c > k){
                    if(s.charAt(left) != ch) c--;
                    left++;
                }
                max = Math.max(max,right - left + 1);
                right++;
            }

        }
        return max;
    }
}
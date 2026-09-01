class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int c = 0;
        int right = 0;
        int left = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                c++;
                set.clear();
                left = right;
            }
            set.add(ch);
            right++;
        }
        if(left < s.length())c++;
        return c;
    }
}
class Solution {
    public int maxDepth(String s) {
        int open = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            if(ch == ')') open--;
            max = Math.max(max,open);
        }
        return max;
    }
}
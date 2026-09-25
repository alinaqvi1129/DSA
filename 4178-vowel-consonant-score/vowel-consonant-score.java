class Solution {
    public int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
            else if(ch >= 97 && ch <= 122) c++;
        }
        if(c > 0) return v / c;
        return 0;
    }
}
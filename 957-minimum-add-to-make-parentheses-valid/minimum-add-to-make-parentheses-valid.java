class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0;
        int c = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') o++;
            else if(ch == ')')o--;
            if(o < 0){
                c++;
                o = 0;
            }
        }
        if(o > 0) c+= o;
        return c;
    }
}
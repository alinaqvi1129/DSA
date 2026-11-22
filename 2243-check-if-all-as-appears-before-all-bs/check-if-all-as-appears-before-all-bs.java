class Solution {
    public boolean checkString(String s) {
        int flag = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'b') flag = 1;
            if(flag == 1 && ch == 'a') return false;
        }
        return true;
    }
}
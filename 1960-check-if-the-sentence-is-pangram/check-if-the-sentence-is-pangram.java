class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            set.add(ch);
        }
        for(char ch = 'a';ch <= 'z';ch++){
            if(!set.contains(ch)) return false;
        }
        return true;
    }
}
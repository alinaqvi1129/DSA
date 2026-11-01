class Solution {
    public int firstUniqChar(String s) {
        int c = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        for(int i = 0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                c = i;
                break;
            }
        }
        return c;
    }
}
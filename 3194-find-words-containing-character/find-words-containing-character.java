class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            int flag = 0;
            for(int j = 0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(ch == x){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) ans.add(i);
        }
        return ans;
    }
}
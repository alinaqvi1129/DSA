class Solution {
    public List<Integer> partitionLabels(String s) {
        HashSet<Character> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int right = 0;
        int left = 0;
        while(right < s.length()){
          char ch = s.charAt(right);
          int check = 0;
          set.add(ch);
          for (Character x : set) {
                if (s.substring(right + 1).indexOf(x) != -1) {
                    check = 1;
                    break;
                }
           }
          if(check == 0){
            ans.add(right - left + 1);
            left = right + 1;
            set.clear();
          }
          right++;
        }
        return ans;
    }
}
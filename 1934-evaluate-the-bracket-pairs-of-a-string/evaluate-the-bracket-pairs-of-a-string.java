class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
    HashMap<String, String> map = new HashMap<>();

    for (List<String> k : knowledge) {
        map.put(k.get(0), k.get(1));
    }

    StringBuilder ans = new StringBuilder();
    StringBuilder key = new StringBuilder();

    boolean inside = false;

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (ch == '(') {
            inside = true;
            key.setLength(0);
        } 
        else if (ch == ')') {
            inside = false;

            String k = key.toString();

            if (map.containsKey(k)) {
                ans.append(map.get(k));
            } else {
                ans.append("?");
            }
        } 
        else if (inside) {
            key.append(ch);
        } 
        else {
            ans.append(ch);
        }
    }

    return ans.toString();
}
}
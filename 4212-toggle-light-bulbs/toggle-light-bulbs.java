class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) % 2 != 0) ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}
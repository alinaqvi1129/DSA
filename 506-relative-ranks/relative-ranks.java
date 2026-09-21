class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = score.clone();
        Arrays.sort(arr);
        int j = 1;
        for(int i = arr.length-1;i>=0;i--) map.put(arr[i],j++);
        String ans[] = new String[score.length];
        for(int i = 0;i<score.length;i++){
            if(map.get(score[i]) == 1)ans[i] = "Gold Medal";
            else if(map.get(score[i]) == 2) ans[i] = "Silver Medal";
            else if(map.get(score[i]) == 3) ans[i] = "Bronze Medal";
            else ans[i] = String.valueOf(map.get(score[i]));
        }
        return ans;
    }
}
class Solution {
    public int hIndex(int[] citations) {
        int max = 0;
        Arrays.sort(citations);
        for(int i = 0;i<citations.length;i++){
            int papers = citations.length - i;
            if(citations[i] >= papers){
                max = Math.max(max,papers);
            }
        }
        return max;
    }
}
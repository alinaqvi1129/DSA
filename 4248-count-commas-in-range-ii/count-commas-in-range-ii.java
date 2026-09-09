class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long t = 1000;
        while(n>= t){
            ans += n - t + 1;
            t *= 1000;
        }
        return ans;
    }
}
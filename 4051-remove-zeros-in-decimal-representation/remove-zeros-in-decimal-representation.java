class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        s= s.replaceAll("0","");
        return Long.parseLong(s);
    }
}
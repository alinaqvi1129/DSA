class Solution {
    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);

        int n = Math.max(a.length(), b.length());

        a = "0".repeat(n - a.length()) + a;
        b = "0".repeat(n - b.length()) + b;

        int c = 0;

        for(int i = 0; i < n; i++) {
            if(a.charAt(i) != b.charAt(i)) c++;
        }

        return c;
    }
}
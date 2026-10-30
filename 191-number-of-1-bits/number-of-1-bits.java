class Solution {
    public int hammingWeight(int n) {
        String b = Integer.toBinaryString(n);
        int c = 0;
        for(int i = 0;i<b.length();i++){
            if(b.charAt(i) == '1')c++;
        }
        return c;
    }
}
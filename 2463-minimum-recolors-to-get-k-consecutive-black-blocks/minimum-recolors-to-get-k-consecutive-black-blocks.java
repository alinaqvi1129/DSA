class Solution {

    public int minimumRecolors(String blocks, int k) {

        int c = 0;
        int n = blocks.length();

        // Count W in the first window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                c++;
            }
        }

        int ans = c;

        // Slide the window
        for (int i = 0; i < n - k; i++) {

            // Remove the leftmost block
            if (blocks.charAt(i) == 'W') {
                c--;
            }

            // Add the new rightmost block
            if (blocks.charAt(i + k) == 'W') {
                c++;
            }

            ans = Math.min(ans, c);
        }

        return ans;
    }
}
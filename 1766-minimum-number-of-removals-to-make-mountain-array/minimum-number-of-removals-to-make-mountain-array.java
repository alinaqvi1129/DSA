class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;

        int[][] dp1 = new int[n][n + 1];
        int[][] dp2 = new int[n][n + 1];

        for (int[] row : dp1) {
            Arrays.fill(row, -1);
        }

        for (int[] row : dp2) {
            Arrays.fill(row, -1);
        }

        int maxMountain = 0;

        for (int peak = 1; peak < n - 1; peak++) {

            // Increasing part ending at peak
            int left = helper1(peak, nums, -1, dp1);

            // Decreasing part starting at peak
            int right = helper2(peak, nums, -1, dp2);

            if (left > 1 && right > 1) {
                maxMountain = Math.max(
                    maxMountain,
                    left + right - 1
                );
            }
        }

        return n - maxMountain;
    }

    // Increasing subsequence ending at i
    int helper1(int i, int[] nums, int prev, int[][] dp) {

        if (i < 0) {
            return 0;
        }

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        // Don't take nums[i]
        int notTake = helper1(i - 1, nums, prev, dp);

        int take = 0;

        // We are constructing the increasing part backwards
        if (prev == -1 || nums[i] < nums[prev]) {
            take = 1 + helper1(i - 1, nums, i, dp);
        }

        return dp[i][prev + 1] = Math.max(take, notTake);
    }

    // Decreasing subsequence starting at i
    int helper2(int i, int[] nums, int prev, int[][] dp) {

        if (i == nums.length) {
            return 0;
        }

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        // Don't take nums[i]
        int notTake = helper2(i + 1, nums, prev, dp);

        int take = 0;

        // Construct decreasing part
        if (prev == -1 || nums[i] < nums[prev]) {
            take = 1 + helper2(i + 1, nums, i, dp);
        }

        return dp[i][prev + 1] = Math.max(take, notTake);
    }
}
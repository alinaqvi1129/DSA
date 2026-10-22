class Solution {
int[][] dp;
public int getMoneyAmount(int n) {
    dp = new int[n + 1][n + 1];
    return helper(1, n);
}

int helper(int left, int right) {
    if (left >= right) return 0;

    if (dp[left][right] != 0) {
        return dp[left][right];
    }

    int ans = Integer.MAX_VALUE;

    for (int i = left; i <= right; i++) {
        int cost = i + Math.max(
            helper(left, i - 1),
            helper(i + 1, right)
        );

        ans = Math.min(ans, cost);
    }

    return dp[left][right] = ans;
}
}

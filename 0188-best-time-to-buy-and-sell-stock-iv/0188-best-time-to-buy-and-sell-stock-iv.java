class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int totalActions = 2 * k;
        int[][] dp = new int[n + 1][totalActions + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int act = 1; act <= totalActions; act++) {
                if (act % 2 == 0) {
                    int c1 = dp[i + 1][act - 1] - prices[i];
                    int c2 = dp[i + 1][act];
                    dp[i][act] = Math.max(c1, c2);
                } else {
                    int c1 = dp[i + 1][act - 1] + prices[i];
                    int c2 = dp[i + 1][act];
                    dp[i][act] = Math.max(c1, c2);
                }
            }
        }

        return dp[0][totalActions];
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return fun(0, 0, m, n, obstacleGrid, dp);
    }

    private int fun(int i, int j, int m, int n, int[][] grid, int[][] dp) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 1) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        return dp[i][j] = fun(i + 1, j, m, n, grid, dp) + fun(i, j + 1, m, n, grid, dp);
    }
}
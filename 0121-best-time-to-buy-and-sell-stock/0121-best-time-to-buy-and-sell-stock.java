class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int [][]dp = new int[n+1][3];
       for(int i = n-1 ; i>=0;i--){
        for( int j = 1 ; j<=2 ;j++){
            if(j==2){
                int c1 = dp[i+1][j-1]-prices[i];
                int c2 = dp[i+1][j];
                dp[i][j] = Math.max(c1,c2);
            }
            else{
                int c1 =dp[i+1][j-1]+prices[i];
                int c2 = dp[i+1][j];
                dp[i][j] = Math.max(c1,c2);
            }
        }
       
       }
        return dp[0][2];
    }
}
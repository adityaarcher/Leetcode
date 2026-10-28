class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [][]dp = new int[n][2];
        for( int i = 0 ;i<n ; i++){
            Arrays.fill(dp[i],-1);
        }
        return fn(nums,n,0,1,dp);
    }
    private int fn(int []a, int n , int  i , int free , int[][]dp){
        if(i==n){
            return 0;
        }
        if(dp[i][free]!=-1){
            return dp[i][free];
        }
        if(free== 0){
            return dp[i][free] = fn(a,n,i+1,1,dp);
        }
    int c  = a[i]+fn(a,n,i+1,0,dp);
    int b = fn(a,n,i+1,1,dp);
    return dp[i][free] = Math.max(c,b);
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2){
            return 0;
        }
        int max = 0;
        int min =Integer.MAX_VALUE;
        int n = prices.length;
for (int i =0 ;i<n;i++){
    if(prices[i]<min){
        min = prices[i];
    }
    else if(prices[i]-min>max){
        max=prices[i]-min;
    }
}
        return max;
    }
}
class Solution {
  /*  private Map<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {

       if(n==0 ||n==1){
        return n ;
       }
       if(map.containsKey(n)){
      return   map.get(n);
       }
       int a = fib(n-1);
       int b = fib(n-2);
       int ans = a+b;
       map.put(n,ans);
       return ans;
    }*/
    public int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        int []dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i<=n; i++){
            dp[i] = dp[i-2]+dp[i-1];      
              }

            return dp[n];
    }

}
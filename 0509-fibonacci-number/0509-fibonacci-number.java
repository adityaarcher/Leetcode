class Solution {
    private Map<Integer,Integer> map = new HashMap<>();
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
    }
}
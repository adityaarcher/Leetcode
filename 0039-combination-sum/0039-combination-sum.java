class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        fn(candidates,candidates.length,0 , diary , 0 , res, target);
        return res;
    }
    private void fn(int[]a , int n , int idx , List<Integer> diary , int sum , List<List<Integer>> res, int target){
        if(idx==n){
            if(sum==target){
                res.add(new ArrayList<>(diary));
            }
            return ;
        }
        fn(a,n,idx+1,diary,sum,res,target);
        if(a[idx]+sum<=target){
            diary.add(a[idx]);
            sum += a[idx];
            fn(a,n,idx,diary,sum,res,target);
            diary.remove(diary.size()-1);
            sum -= a[idx];
        }
    }
}
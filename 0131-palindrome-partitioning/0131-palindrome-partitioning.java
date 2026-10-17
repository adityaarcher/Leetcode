class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> diary = new ArrayList<>();
        fn(s,s.length(), 0 , diary , res);
        return res;
    }
    private void fn(String s, int n , int idx , List<String> diary, List<List<String>> res){
        if(idx==n){
            res.add(new ArrayList(diary));
            return;
        }
        for(int i = idx ; i<n ; i++){
           if(palindrome(s,idx,i)){
            diary.add(s.substring(idx,i+1));
            fn(s,n , i+1,diary, res);
            diary.remove(diary.size()-1);
           }
        }
    }
    private boolean palindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
class Solution {
   private String[] f = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        if(digits == null ||digits.length()==0){
            return new ArrayList<>();
        }
        List<String> res= new ArrayList<>();
        StringBuilder  diary = new StringBuilder();
        fn(digits,digits.length(),0,diary,res);
        return res;
    }
    private void fn(String s, int n , int idx , StringBuilder diary , List<String> res){
        if(idx==n){
            res.add(diary.toString());
            return ;
        }
        String choice =  f[s.charAt(idx)-'0'];
        for(int  j=0 ; j<choice.length() ;j++){
            diary.append(choice.charAt(j));
            fn(s,n,idx+1,diary,res);
            diary.deleteCharAt(diary.length()-1);
        }
        
    }
}
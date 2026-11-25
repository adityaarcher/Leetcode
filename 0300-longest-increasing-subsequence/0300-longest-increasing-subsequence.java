class Solution {
    public int lengthOfLIS(int[] nums) {
     List<Integer> t = new ArrayList<>();
     for( int num:nums){
        int l = 0 ;
        int r = t.size();
        while(l<r){
            int mid = (l+r)/2;
            if(t.get(mid)<num){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        if(l==t.size()){
            t.add(num);
        }
        else{
            t.set(l,num);
        }
     }
     return t.size();
    }
}
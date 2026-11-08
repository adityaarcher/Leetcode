class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 2;
        int ptr= 2;
        while(ptr<nums.length){
            if(nums[ptr]!=nums[unique-2]){
                nums[unique] = nums[ptr];
                unique++;
            }
            ptr++;
        }
        return unique;
    }
}
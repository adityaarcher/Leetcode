class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int bitMask = 1 << i;

            for (int num : nums) {
                if ((num & bitMask) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= bitMask;
            }
        }

        return result;
    }
}
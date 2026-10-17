class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        fun(nums, diary, visited, res);
        return res;
    }

    private void fun(int[] nums, List<Integer> diary, boolean[] visited, List<List<Integer>> res) {
        if (diary.size() == nums.length) {
            res.add(new ArrayList<>(diary));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                diary.add(nums[i]);

                fun(nums, diary, visited, res);

                diary.remove(diary.size() - 1);
                visited[i] = false;
            }
        }
    }
}
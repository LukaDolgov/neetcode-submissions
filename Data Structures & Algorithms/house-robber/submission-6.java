class Solution {
    private int[] nums;
    private Integer[] memo;
    public int rob(int[] nums) {
        this.nums = nums;
        this.memo = new Integer[nums.length];
        return dfs(0);
    }
    private int dfs(int pos) {
        if (pos >= nums.length) {
            return 0;
        } else if (memo[pos] != null) {
            return memo[pos];
        } else {
            memo[pos] = Math.max(dfs(pos + 1), dfs(pos + 2) + nums[pos]);
            return memo[pos];
        }
    }
}

class Solution {
    private Integer[] memo;
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        this.memo = new Integer[n];
        int[] first = Arrays.copyOfRange(nums, 0, n - 1);
        int resf = dfs(0, first);
        this.memo = new Integer[n];
        int[] second = Arrays.copyOfRange(nums, 1, n);
        int resl = dfs(0, second);
        return Math.max(resf, resl);
    }
    private int dfs(int pos, int[] arr) {
        if (pos >= arr.length) {
            return 0;
        } else if (memo[pos] != null) {
            return memo[pos];
        } else {
            memo[pos] = Math.max(dfs(pos + 1, arr), dfs(pos + 2, arr) + arr[pos]);
            return memo[pos];
        }
    }
}

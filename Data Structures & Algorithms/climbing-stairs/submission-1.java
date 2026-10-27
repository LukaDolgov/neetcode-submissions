class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return dfs(n, memo);
    }
    private int dfs(int r, int[] memo) {
        if (r == 0) {
        return 1;
        } else if (r < 0) {
            return 0;
        } else if (memo[r] != 0) {
            return memo[r];
        } else {
            memo[r] = dfs(r - 1, memo) + dfs(r - 2, memo);
            return memo[r];
        }
    }
}

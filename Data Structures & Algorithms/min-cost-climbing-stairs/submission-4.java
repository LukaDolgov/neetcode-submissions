class Solution {
    private int[] cost;
    private Integer[] memo;
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        this.memo = new Integer[cost.length];
        return Math.min(dfs(0), dfs(1));
    }
    private int dfs(int pos) {
        if (pos >= cost.length) {
            return 0;
        } else if (memo[pos] != null) {
            return memo[pos];
        } else{
            memo[pos] = Math.min(dfs(pos + 1) + cost[pos], dfs(pos + 2) + cost[pos]);
            return memo[pos];
        }
    }
}

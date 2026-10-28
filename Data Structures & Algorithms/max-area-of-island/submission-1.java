class Solution {
    private Set<List<Integer>> visited;
    public int maxAreaOfIsland(int[][] grid) {
        this.visited = new HashSet<>();
        int maxa = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (!visited.contains(List.of(r, c)) && grid[r][c] == 1) {
                    maxa = Math.max(maxa, dfs(grid, r, c));
                }
            }
        }
        return maxa;
        
    }
    private int dfs(int[][] grid, int r, int c) {
        visited.add(List.of(r, c));
        int[][] dirs = {
            {r + 1, c},
            {r - 1, c},
            {r, c+1},
            {r, c-1}
        };
        int ta = 1;
        for (int[] d : dirs) {
            if (
                d[0] >= grid.length ||
                d[1] >= grid[0].length ||
                d[0] < 0 ||
                d[1] < 0 || 
                visited.contains(List.of(d[0], d[1])) ||
                grid[d[0]][d[1]] == 0
            ) {
                continue;
            } else {
                ta = ta + dfs(grid, d[0], d[1]);
            }
        }
        return ta;
    }
}

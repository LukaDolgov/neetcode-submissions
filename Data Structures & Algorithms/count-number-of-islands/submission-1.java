class Solution {
    private Set<List<Integer>> visited;
    public int numIslands(char[][] grid) {
        int islands = 0;
        this.visited = new HashSet<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (!visited.contains(List.of(r, c)) && grid[r][c] == '1') {                  islands++;
                    dfs(grid, r, c);
                }
            }
        }
        return islands;
    }
    private void dfs(char[][] grid, int r, int c) {
        int[][] dirsn = {
            {r + 1, c},
            {r - 1, c},
            {r, c + 1},
            {r, c - 1},
        };
        for (int[] d : dirsn) {
            int nr = d[0];
            int nc = d[1];
            if (nr >= grid.length ||
                nc >= grid[0].length ||
                nr < 0 ||
                nc < 0 ||
                visited.contains(List.of(nr, nc)) ||
                grid[nr][nc] == '0') {
                continue;
            } else {
                visited.add(List.of(nr, nc));
                dfs(grid, d[0], d[1]);
            }
        }

    }
}

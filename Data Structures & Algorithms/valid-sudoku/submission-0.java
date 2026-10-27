class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> crow = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                char curr = board[i][j];
                if (curr == '.') {
                    continue;
                }
                if (crow.contains(curr)) {
                    return false;
                } else {
                    crow.add(curr);
                }
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            Set<Character> ccol = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char curr = board[j][i];
                if (curr == '.') {
                    continue;
                }
                if (ccol.contains(curr)) {
                    return false;
                } else {
                    ccol.add(curr);
                }
            }
        }
        List<Set<Character>> boxes = new ArrayList<>();
        for (int k = 0; k < 9; k++) {
            boxes.add(new HashSet<>());
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int curind = (i / 3) * 3 + (j / 3);
                char curr = board[i][j];
                if (curr == '.') {
                    continue;
                }
                Set<Character> curset = boxes.get(curind);
                if (curset.contains(curr)) {
                    return false;
                } else {
                    curset.add(curr);
                }
            }
        }

        return true;
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> r = new ArrayList<>();
        List<HashSet<Character>> c = new ArrayList<>();
        List<HashSet<Character>> b = new ArrayList<>();

        // add hash set for all row,col and sub box
        for (int i = 0; i < 9; i++) {
            r.add(new HashSet<>());
            c.add(new HashSet<>());
            b.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char n = board[i][j];
                if (n == '.') continue; // Skip empty cells

                //row
                if (r.get(i).contains(n)) return false;
                r.get(i).add(n);

                //column
                if (c.get(j).contains(n)) return false;
                c.get(j).add(n);

                //box
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (b.get(boxIndex).contains(n)) return false;
                b.get(boxIndex).add(n);
            }
        }
        return true;
    }
}
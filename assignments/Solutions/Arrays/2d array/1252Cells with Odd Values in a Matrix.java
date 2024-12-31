class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;

        // Increment rows and columns based on indices
        for (int i = 0; i < indices.length; i++) {
            // Increment all columns in the specified row
            int row = indices[i][0];
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            // Increment all rows in the specified column
            int col = indices[i][1];
            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }

        // Count cells with odd values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int m1 = 2, n1 = 3;
        int[][] indices1 = {{0, 1}, {1, 1}};
        System.out.println("Test Case 1 Result: " + solution.oddCells(m1, n1, indices1));
        // Expected output: 6

        // Test case 2
        int m2 = 3, n2 = 2;
        int[][] indices2 = {{1, 1}, {0, 0}};
        System.out.println("Test Case 2 Result: " + solution.oddCells(m2, n2, indices2));
        // Expected output: 4

        // Additional test cases
        int m3 = 1, n3 = 1;
        int[][] indices3 = {{0, 0}};
        System.out.println("Test Case 3 Result: " + solution.oddCells(m3, n3, indices3));
        // Expected output: 1

        int m4 = 2, n4 = 2;
        int[][] indices4 = {{0, 0}, {1, 1}};
        System.out.println("Test Case 4 Result: " + solution.oddCells(m4, n4, indices4));
        // Expected output: 4
    }
}

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // right, down, left, up
        int directionIndex = 0; // Start with 'right'
        int index = 0;
        int steps = 1; // Steps to move in current direction
        int[][] ans = new int[rows * cols][2];
        ans[index++] = new int[]{rStart, cStart}; // Add starting position

        while (index < rows * cols) { // Loop until all positions are visited
            for (int i = 0; i < 2; i++) { // Repeat for 2 directions before incrementing steps
                for (int step = 0; step < steps; step++) {
                    // Update current position
                    rStart += directions[directionIndex][0];
                    cStart += directions[directionIndex][1];

                    // Add to result if within bounds
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        ans[index++] = new int[]{rStart, cStart};
                    }
                }
                // Change direction
                directionIndex = (directionIndex + 1) % 4;
            }
            // Increment steps after two direction changes
            steps++;
        }
        return ans;
    }
}

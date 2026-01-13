// Implemented an O(n + m) algorithm to find a target element in a matrix sorted by rows and columns.
// The solution starts from the top-right corner and eliminates one row or column per comparison.
// Includes clear return of 1-based indices and proper handling when the target is not found.

import java.util.Arrays;

public class RowColSortedMatric {

    public static void main(String[] args) {

        // Given row-wise and column-wise sorted matrix
        int[][] mat = {
                {2, 8, 10, 12},
                {18, 21, 28, 31},
                {40, 46, 47, 51},
                {53, 55, 60, 64}
        };

        int target = 47;

        // Find row and column of target
        int[] res = findRowCol(mat, target);

        // Print result
        System.out.println(Arrays.toString(res));
    }

    /**
     * Finds the position of target in a row-wise and column-wise sorted matrix
     * @param mat input matrix
     * @param target element to search
     * @return 1-based index of row and column, or {-1, -1} if not found
     */
    static int[] findRowCol(int[][] mat, int target) {

        // Start from top-right corner
        int row = 0;
        int col = mat[0].length - 1;

        // Traverse until indices go out of bounds
        while (row < mat.length && col >= 0) {

            // If target is found
            if (mat[row][col] == target) {
                // Return 1-based index
                return new int[]{row + 1, col + 1};
            }

            // If current element is greater, move left
            if (mat[row][col] > target) {
                col--;
            }
            // If current element is smaller, move down
            else {
                row++;
            }
        }

        // Target not found
        return new int[]{-1, -1};
    }
}

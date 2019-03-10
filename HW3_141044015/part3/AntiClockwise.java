package part3;

/**
 * A version of clockwise that used for anticlockwise
 */
public class AntiClockwise extends Clockwise {

    /**
     * Constructor gets information of matrix
     * @param originalMatrix 2D matrix array
     * @param col # of col
     * @param row # of row
     */
    public AntiClockwise(int[][] originalMatrix, int col, int row) {
        super(originalMatrix, col, row);
    }

    /**
     * This method iterates anticlockwise and adds to 1D array
     * NOTE: Referenced from https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
     * @return 1D result iteration array
     */
    @Override
    public int[] iterateSpiral(){

        ///////////////////////////REFERENCE///////////////////////////////////
        int i, k = 0, l = 0;
        int m = row, n = col;

        /*  k - starting row index
            m - ending row index
            l - starting column index
            n - ending column index
            i - iterator */

        int cwCounter = 0;

        while (k < m && l < n)
        {
            /* Print the first row from the remaining rows */
            for (i = k; i < m; ++i) {
                clockwiseMatrix[cwCounter] = originalMatrix[i][l];
                cwCounter++;
            }
            l++;

            /* Print the last column from the remaining columns */
            for (i = l; i < n; ++i) {
                clockwiseMatrix[cwCounter] = originalMatrix[m-1][i];
                cwCounter++;
            }
            m--;

            /* Print the last row from the remaining rows */
            for (i = m-1; i >= k; --i) {
                clockwiseMatrix[cwCounter] = originalMatrix[i][n-1];
                cwCounter++;
            }
            n--;

            /* Print the first column from the remaining columns */
            for (i = n-1; i >= l; --i) {
                clockwiseMatrix[cwCounter] = originalMatrix[k][i];
                cwCounter++;
            }
            k++;

        }
        // https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
        ///////////////////////////REFERENCE///////////////////////////////////

        return clockwiseMatrix;
    }
}

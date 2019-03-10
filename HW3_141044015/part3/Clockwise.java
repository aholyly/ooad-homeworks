package part3;

/**
 * Clockwise is used for iterate clockwise in given matrix.
 */
public class Clockwise implements Iterator {
    protected int[][] originalMatrix;
    protected int[] clockwiseMatrix;
    protected int col, row;
    protected int position = 0;

    /**
     * Constructor gets information of matrix
     * @param originalMatrix 2D matrix array
     * @param col # of col
     * @param row # of row
     */
    public Clockwise(int[][] originalMatrix, int col, int row) {
        this.originalMatrix = originalMatrix;
        this.col = col;
        this.row = row;
        clockwiseMatrix = new int[col*row];
        iterateSpiral();
    }

    /**
     * This method iterates clockwise and adds to 1D array
     * NOTE: Referenced from https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
     * @return 1D result iteration array
     */
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
            for (i = l; i < n; ++i) {
                clockwiseMatrix[cwCounter] = originalMatrix[k][i];
                cwCounter++;
            }
            k++;

            /* Print the last column from the remaining columns */
            for (i = k; i < m; ++i) {
                clockwiseMatrix[cwCounter] = originalMatrix[i][n-1];
                cwCounter++;
            }
            n--;

            /* Print the last row from the remaining rows */
            for (i = n-1; i >= l; --i) {
                clockwiseMatrix[cwCounter] = originalMatrix[m-1][i];
                cwCounter++;
            }
            m--;

            /* Print the first column from the remaining columns */
            for (i = m-1; i >= k; --i) {
                clockwiseMatrix[cwCounter] = originalMatrix[i][l];
                cwCounter++;
            }
            l++;

        }
        // https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
        ///////////////////////////REFERENCE///////////////////////////////////

        return clockwiseMatrix;
    }

    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements.
     */
    @Override
    public boolean hasNext() {
        if (position >= clockwiseMatrix.length) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Returns the next element in the iteration.
     * @return the next element in the iteration.
     */
    @Override
    public Object next() {
        int number = clockwiseMatrix[position];
        position = position + 1;
        return number;
    }
}

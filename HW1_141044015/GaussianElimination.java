package part1;

import java.util.List;

/**
 * Gaussian Elimination method for solving mathematical equations
 * Extended from SolvingMethodsAbstract abstract method
 */
public class GaussianElimination extends SolvingMethodsAbstract {

    /**
     * Solves the given equation. All steps are given below within comments.
     * @return whether the equation can be solved
     */
    public boolean solve(){

        Float[][] result = super.originalMatrix;
        int rowCount = super.order;

        // Find the pivot elements
        for (int col = 0; col + 1 < rowCount; col++){
            // check for zero coefficients
            if (result[col][col] == 0){
                // find non-zero coefficient
                int swapRow = col + 1;

                for (;swapRow < rowCount; swapRow++)
                    if (result[swapRow][col] != 0)
                        break;

                // found a non-zero coefficient?
                if (result[swapRow][col] != 0){
                    // yes, then swap it with the above
                    float[] tmp = new float[rowCount + 1];
                    for (int i = 0; i < rowCount + 1; i++){
                        tmp[i] = result[swapRow][i];
                        result[swapRow][i] = result[col][i] ;
                        result[col][i] = tmp[i];
                    }
                }
	            else
                    return false; // no, then the originalMatrix has no unique solution
            }
        }


        // Eleminates row except pivots
        for (int sourceRow = 0; sourceRow + 1 < rowCount; sourceRow++)
        {
            for (int destRow = sourceRow + 1; destRow < rowCount; destRow++)
            {
                float df = result[sourceRow][sourceRow];
                float sf = result[destRow][sourceRow];
                for (int i = 0; i < rowCount + 1; i++)
                    result[destRow][i] = result[destRow][i] * df 
                            - result[sourceRow][i] * sf;
            }
        }


        // Re-align the matrix
        for (int row = rowCount - 1; row >= 0; row--)
        {
            float f = result[row][row];
            if (f == 0)
                return
                    false;

            for (int i = 0; i < rowCount + 1; i++)
                result[row][i] /= f;

            for (int destRow = 0; destRow < row; destRow++){
                result[destRow][rowCount] -= result[destRow][row] * result[row][rowCount] ;
                result[destRow][row] = (float)0;
            }
        }

        // Gets result and print
        super.originalMatrix = result;
        System.out.println("\nResult");
        printEquation();

        return true;
    }


}

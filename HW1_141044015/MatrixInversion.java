package part1;

/**
 * Matrix Inversion method for solving mathematical equations
 * Extended from SolvingMethodsAbstract abstract method
 */
public class MatrixInversion extends SolvingMethodsAbstract {

    /**
     * Solves the given equation. All steps are given below within comments.
     * @return whether the equation can be solved
     */
    public boolean solve(){

        // temporary elements for solving
    	Float[][] matrixA = new Float[order][order];
    	Float[] matrixB = new Float[order];
    	Float[][] multiply = new Float[order][order];


        // fill the inverse matrix elements
    	for (int i = 0; i < order; ++i) {
    		matrixB[i] = originalMatrix[i][order-1];
    		for (int j = 0; j < order; ++j) {
    			matrixA[i][j]= originalMatrix[i][j];
    		}
    	}

		float det;

    	// get determinant
		det = determinant(matrixA, order);

		//unsolvable if det = 0
		if (det == 0)
        {
            System.out.println("Your equation cannot be solved!");
            return false;
        }
        //solvable
		else{
		    //gets
            matrixA = cofactor(matrixA);


			float sum = 0;
	        for (int i = 0; i < order; i++) {
	          for (int j = 0; j < 1; j++) {
	            for (int k = 0; k < order; k++) {
	              sum = sum + matrixA[i][k]*matrixB[k];
	            }
	     
	            multiply[i][j] = sum;
	            sum = (float)0;
	          }
	        }
	      
	        System.out.println("\nResult:");

	        for (int c = 0; c < order; c++) {
	          for (int d = 0; d < 1; d++)
	            System.out.print(multiply[c][d] + "\t");
	          
	          System.out.print("\n");
	        }

			return true;
		}
    }

    /*For calculating Determinant of the Matrix */
    public Float determinant(Float[][] matrix, int tempOrder){

		float k = 1, det = 0;

		//temp value
		Float[][] temp = new Float[tempOrder][tempOrder];

		//recursion finish condition
		if (tempOrder == 1){
			return (matrix[0][0]);
		}
		else{
			for (int c = 0; c < tempOrder; c++){

				int m = 0;
				int n = 0;

				// get sub-matrix
				for (int i = 0; i < tempOrder; i++){
					for (int j = 0 ; j < tempOrder; j++){
						temp[i][j] = (float)0;
						if (i != 0 && j != c){
							temp[m][n] = matrix[i][j];
							if (n < (tempOrder - 2))
								n++;
							else{
								n = 0;
								m++;
							}
						}
					}
				}

				//get determinant of sub-matrix
				det = det + k * (matrix[0][c] * determinant(temp, tempOrder - 1));

				k *= -1;
			}
		}

		return (det);
	}

	// get cofactor of given matrix
    public Float[][] cofactor(Float[][] matrix){

		Float[][] temp1 = new Float[order][order];
		Float[][] fac = new Float[order][order];

		// get sub-matrix
		for (int q = 0; q < order; q++){
			for (int p = 0;p < order; p++){
				int m = 0;
				int n = 0;
				for (int i = 0; i < order; i++){

					for (int j = 0; j < order; j++){
						if (i != q && j != p){
							temp1[m][n] = matrix[i][j];
							if (n < (order - 2))
								n++;
							else{
								n = 0;
								m++;
							}
						}
					}
				}
				// cofactor of sub-matrix
				fac[q][p] = (float)Math.pow(-1, q + p) * determinant(temp1, order - 1);
			}
		}
		//go to transpose
		return transpose(matrix, fac);
	}


	//get transpose of matrix
    public Float[][] transpose(Float[][] matrix, Float[][] fac){

		Float[][] temp = new Float[order][order];
		Float[][] inverse = new Float[order][order];
		float det;

		//add elements to the right positions
		for (int i = 0; i < order; i++){
			for (int j = 0; j < order; j++){
				temp[i][j] = fac[j][i];
			}
		}

		det = determinant(matrix, order);

		//divide by determinant
		for (int i = 0; i < order; i++){
			for (int j = 0; j < order; j++){
				inverse[i][j] = temp[i][j] / det;
			}
		}

		// returns the inverse of matrix
		return inverse;
	}
}

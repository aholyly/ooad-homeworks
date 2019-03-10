package part3;

/**
 * Test Class
 */
public class TestDrive {

    public static void main(String[] args){

        //MATRIX
        int row = 4;
        int col = 4;
        int matrix[][] = { { 1,  2,  3,  4},
                           { 5,  6,  7,  8},
                           { 9, 10, 11, 12},
                           {13, 14, 15, 16} };

        //Clockwise Objects
        Iterator clockwiseIterator = new Clockwise(matrix,col,row);
        Iterator antiClockwiseIterator = new AntiClockwise(matrix,col,row);

        System.out.println("TEST CLOCKWISE");
        System.out.println("-------------");
        printMatrix(clockwiseIterator);

        System.out.println("\nTEST ANTICLOCKWISE");
        System.out.println("------------------");
        printMatrix(antiClockwiseIterator);

    }

    /**
     * Prints the given iterator
     * @param iterator
     */
    public static void printMatrix(Iterator iterator){
        while (iterator.hasNext()) {
            int value = (int)iterator.next();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

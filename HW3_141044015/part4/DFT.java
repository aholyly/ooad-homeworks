package part4;

/**
 * A version of DiscreteTransform that name is Discrete Fourier Transform
 */
public class DFT extends DiscreteTransform {

    private boolean isPrint;

    /**
     * Gets file and print status
     * @param inputFile file name
     * @param isPrint print status
     */
    public DFT(String inputFile, boolean isPrint) {
        super(inputFile);
        this.isPrint = isPrint;
    }

    /**
     * Transformation processes
     */
    @Override
    protected void transform() {
        System.out.println("Transform to DFT");
    }

    /**
     * Prints the execution time of transformation process
     */
    @Override
    protected void printExecutionTime() {
        if(isPrint)
            System.out.println("Execution Time: 115ms");
    }
}

package part4;

/**
 * An abstract class for Discrete Transformation
 */
public abstract class DiscreteTransform {

    private String inputFile;

    /**
     * Constructor gets name of input file
     * @param inputFile file name
     */
    public DiscreteTransform(String inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * Reads from file
     * @return true if reading successful
     */
    private boolean readFromFile(){
        System.out.println("Reading from " + inputFile);
        return true;
    }

    /**
     * Transformation processes
     */
    abstract void transform();

    /**
     * Print the result to file
     * @return true if writing successful
     */
    private boolean exportResult(){
        System.out.println("Writing to " + "out_" + inputFile);
        return true;
    }

    /**
     * Prints the execution time of transformation process
     * Used only in DFT
     */
    protected void printExecutionTime(){
        //Do nothing
    }

    /**
     * Does the job
     */
    public final void startProcess(){
        readFromFile();
        transform();
        exportResult();
        printExecutionTime();
    }

}

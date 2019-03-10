package part4;

/**
 * A version of DiscreteTransform that name is Discrete Cosine Transform
 */
public class DCT extends DiscreteTransform {

    /**
     * Gets file name
     * @param inputFile file name
     */
    public DCT(String inputFile) {
        super(inputFile);
    }

    /**
     * Transformation processes
     */
    @Override
    protected void transform() {
        System.out.println("Transform to DCT");
    }
}

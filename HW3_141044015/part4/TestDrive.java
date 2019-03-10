package part4;

/**
 * Test Class
 */
public class TestDrive {

    public static void main(String[] args){
        //Object Creation
        DiscreteTransform dct = new DCT("matrix.txt");
        DiscreteTransform dft = new DFT("matrix.txt",false);
        DiscreteTransform dft2 = new DFT("matrix.txt",true);

        System.out.println("TEST DCT");
        System.out.println("--------");
        dct.startProcess();

        System.out.println("\nTEST DFT");
        System.out.println("--------");
        dft.startProcess();

        System.out.println("\nTEST DFT WITH TIME");
        System.out.println("--------------------");
        dft2.startProcess();
    }
}

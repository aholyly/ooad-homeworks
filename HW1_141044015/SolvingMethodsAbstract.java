package part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * An abstract class for solving methods. If a new method needs to be added,
 * extend from this class.
 */
public abstract class SolvingMethodsAbstract {

    //
    protected Float[][] originalMatrix;
    protected int order;

    public SolvingMethodsAbstract() {
        getEquation();
    }

    abstract boolean solve();
    
    public void getEquation(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quantity of coefficients");
        order =  sc.nextInt();

        originalMatrix = new Float[order][order+1];

        System.out.println("You need to enter " + order + " equations");

        for (int i = 0; i < order; ++i) {
            System.out.println("Please enter coefficients of #" + (i+1)
                    + " equation by descending order and result ");


            ArrayList<Float> coefficients = new ArrayList<Float>();
            for (int j = 0; j < order + 1; ++j) {
                coefficients.add( sc.nextFloat() );
            }
            originalMatrix[i] = coefficients.toArray(originalMatrix[i]);
        }

        sc.close();

        System.out.println("\nYour equation:");
        printEquation();
    }

    public void printEquation(){

        char startLetter = 'a';

        for (int i = 0; i < order; ++i) {
            for (int j = 0; j < order; ++j) {

                System.out.print("(" + originalMatrix[i][j] );
                System.out.print( (char)(startLetter+j) + ") ");

                if(j != order-1)
                {
                    System.out.print("+ ");
                }
            }

            System.out.print("= " + originalMatrix[i][order] + "\n");
        }
    }

}

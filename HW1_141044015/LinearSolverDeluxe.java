package part1;

import java.util.Scanner;

/**
 * This program is made to solve mathematical equations.
 * In this program, there are two solving methods and they are
 * Gaussian Elimination and Matrix Inversion.
 * If a new solving method needs to be added, it can be extends from SolvingMethodsAbstract class.
 */
public class LinearSolverDeluxe {

    public static void main(String[] args){
        start();
    }

    /**
     * Starts the program according to the user's choice.
     */
    public static void start(){
        greeting();
    	
    	SolvingMethodsAbstract Equation = null;

        int menuChoice = getChoice();

        //GAUSSIAN ELIMINATION
        if(menuChoice == 1)
            Equation = new GaussianElimination();


        //MATRIX INVERSION
        if(menuChoice == 2)
            Equation = new MatrixInversion();

        if(Equation.solve() == false)
            System.out.println("Your equation cannot be solved!");


        System.out.println("\nGood bye!\n");
    }

    /**
     * Greeting for the user. This is similar to the user interface.
     */
    public static void greeting(){
        System.out.println("################################");
        System.out.println("#      LinearSolverDeluxe      #");
        System.out.println("################################");
        System.out.println("# 1-Gaussian Elimination       #");
        System.out.println("# 2-Matrix Inversion           #");
        System.out.println("# 3-Exit                       #");
        System.out.println("################################");
    }

    /**
     * Gets solving method choice
     * @return chosen method
     */
    public static int getChoice(){

        Scanner sc = new Scanner(System.in);
        String menuChoice;
        int error = 0;

        //getting the correct choice and handling errors
        do{
            error = 0;
            menuChoice = sc.next();
            try{
                if(Integer.parseInt(menuChoice) < 1 ||
                        Integer.parseInt(menuChoice) > 3)
                    throw new NumberFormatException();
            }
            catch(Exception e){
                error = 1;
                System.out.println("Please enter a valid number!");
            }
        }
        while(error == 1);

        return Integer.parseInt(menuChoice);
    }


}

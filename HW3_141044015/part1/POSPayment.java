package part1;

/**
 * Implementation of TurboPayment
 */
public class POSPayment implements TurboPayment {

    /**
     * Payment implementation
     * @param turboCardNo 16-digit card number
     * @param turboAmount amount to pay
     * @param destinationTurboOfCourse destination firm
     * @param installmentsButInTurbo number of installments
     * @return 1-success, 0-fail
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("POS Payment Summary:");

        if(turboCardNo.length() != 16){
            System.out.println("Fail: Invalid card number");
            System.out.println("Try again!");
            return 0;
        }
        else if(turboAmount <= 0){
            System.out.println("Fail: Invalid amount");
            System.out.println("Try again!");
            return 0;
        }
        else if(destinationTurboOfCourse == null){
            System.out.println("Fail: Invalid destination");
            System.out.println("Try again!");
            return 0;
        }
        else if(Integer.parseInt(installmentsButInTurbo) != 1)
        {
            System.out.println("Fail: installment not available");
            System.out.println("Try again!");
            return 0;
        }
        else{
            System.out.println("Success");
            System.out.println(turboCardNo.substring(0,3) + "xxxx xxxx xx" + turboCardNo.substring(14,15) );
            System.out.println(turboAmount + " TL");
            System.out.println(installmentsButInTurbo + "installments");

            return 1;
        }
    }
}

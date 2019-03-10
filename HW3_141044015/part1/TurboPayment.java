package part1;

/**
 * An interface for TurboPayment
 */
public interface TurboPayment {

    /**
     * Payment Method
     * @param turboCardNo 16-digit card number
     * @param turboAmount amount to pay
     * @param destinationTurboOfCourse destination firm
     * @param installmentsButInTurbo number of installments
     * @return 1-success, 0-fail
     */
    int payInTurbo(String turboCardNo, float turboAmount,
                   String destinationTurboOfCourse, String installmentsButInTurbo);
}

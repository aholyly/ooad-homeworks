package part1;

/**
 * PaymentAdapter is a adapter class that uses for adaptation ModernPayment to TurboPayment
 */
public class PaymentAdapter implements TurboPayment {

    private ModernPayment modernPayment;

    /**
     * Takes ModernPayment to use its pay method
     * @param modernPayment
     */
    public PaymentAdapter(ModernPayment modernPayment) {
        this.modernPayment = modernPayment;
    }

    /**
     * Adapter payment method
     * @param turboCardNo 16-digit card number
     * @param turboAmount amount to pay
     * @param destinationTurboOfCourse destination firm
     * @param installmentsButInTurbo number of installments
     * @return 1-success, 0-fail
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {

        return modernPayment.pay(turboCardNo,turboAmount,destinationTurboOfCourse,installmentsButInTurbo);
    }
}

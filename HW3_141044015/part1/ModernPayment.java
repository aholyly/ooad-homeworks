package part1;

/**
 * An interface for Modern Payments
 */
public interface ModernPayment {

    /**
     * Payment method
     * @param cardNo 16-digit card number
     * @param amount amount to pay
     * @param destination destination firm
     * @param installments number of installments
     * @return 1-success, 0-fail
     */
    int pay(String cardNo, float amount, String destination, String installments);
}

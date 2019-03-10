package part1;

/**
 * Implementation of ModernPayment
 */
public class OnlinePayment implements ModernPayment {

    /**
     * Payment implementation
     * @param cardNo 16-digit card number
     * @param amount amount to pay
     * @param destination destination firm
     * @param installments number of installments
     * @return 1-success, 0-fail
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("Online Payment summary:");

        if(cardNo.length() != 16){
            System.out.println("Fail: Invalid card number");
            System.out.println("Try again!");
            return 0;
        }
        else if(amount <= 0){
            System.out.println("Fail: Invalid amount");
            System.out.println("Try again!");
            return 0;
        }
        else if(destination == null){
            System.out.println("Fail: Invalid destination");
            System.out.println("Try again!");
            return 0;
        }
        else if(Integer.parseInt(installments) <= 0)
        {
            System.out.println("Fail: Invalid installments");
            System.out.println("Try again!");
            return 0;
        }
        else{
            System.out.println("Success");
            System.out.println(destination);
            System.out.println(cardNo.substring(0,4) + " xxxx xxxx xx" + cardNo.substring(14,16) );
            System.out.println(amount + " TL");
            System.out.println(installments + "installments");

            return 1;
        }
    }
}

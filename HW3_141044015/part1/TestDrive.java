package part1;

/**
 * Test Class
 */
public class TestDrive {

    public static void main(String[] args){
        //Method parameters
        String cardNo = "4331055328190794";
        float amount = (float)142.5;
        String destination = "Kelebek Cafe";
        String installments = "1";


        System.out.println("Testing POSPayment (TurboPayment)");
        System.out.println("---------------------------------");
        TurboPayment posPayment = new POSPayment();
        posPayment.payInTurbo(cardNo,amount,destination,installments);

        System.out.println("\nTesting OnlinePayment (ModernPayment)");
        System.out.println("---------------------------------------");
        ModernPayment onlinePayment = new OnlinePayment();
        onlinePayment.pay(cardNo,amount,destination,installments);

        System.out.println("\nTesting Adapter (TurboPayment)");
        System.out.println("--------------------------------");
        TurboPayment paymentAdapter = new PaymentAdapter(onlinePayment);
        paymentAdapter.payInTurbo(cardNo,amount,destination,installments);

    }
}

public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int paymentMonth = service.calculate(1_000_000, 24, 9.99);

        System.out.println(paymentMonth);
    }

}
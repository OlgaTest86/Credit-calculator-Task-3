public class CreditPaymentService {

    public int calculate ( int sumCredit, int loanTerm, double interestRate ) {

        double im = interestRate/(100*12);
        double paymentMonth = sumCredit *(im/(1-(Math.pow(1+im,-loanTerm))));
        int result = (int)paymentMonth;
        return (int) paymentMonth;

    }
}

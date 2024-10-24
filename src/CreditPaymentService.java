public class CreditPaymentService {

    public int calculate(int creditAmountRub, int creditDurationMonths) {
        double percentMonth = 9.99/ 100 / 12;
        double monthlyPayment = creditAmountRub * percentMonth / (1 - Math.pow(1 + percentMonth, - creditDurationMonths));
        int result = (int) monthlyPayment;
        return result;
    }
}

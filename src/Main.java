public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();

        System.out.println("1 000 000 на 1 год");
        System.out.println(credit.calculate(1_000_000, 12));
        System.out.println();

        System.out.println("1 000 000 на 2 года");
        System.out.println(credit.calculate(1_000_000, 24));
        System.out.println();

        System.out.println("1 000 000 на 3 года");
        System.out.println(credit.calculate(1_000_000, 36));
        System.out.println();
    }
}
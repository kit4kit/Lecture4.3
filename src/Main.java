public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sumCredit = 1_000_000;
        float percent = 0.008325F;
        int numberOfMonths = 36;
        double payment = service.calculate(sumCredit, percent, numberOfMonths);
        System.out.println(payment);
    }
}

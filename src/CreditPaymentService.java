public class CreditPaymentService {
    public double calculate(int sumCredit,float percent, int numberOfMonths){
        double step1 = Math.pow((1 + percent), numberOfMonths);
        double step2 = (percent * step1);
        double step3 = step1;
        float step4 = (float)step3 - 1;
        double step5 = step2 / step4;
        int payment = (int)(sumCredit * step5);
        return payment;
    }
}

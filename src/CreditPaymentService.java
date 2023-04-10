public class CreditPaymentService {
    public int calculate(int summaKredita, double procent, int month) {
        double koeff = procent + (procent / (Math.pow((1 + procent), month) - 1));
        int result = (int) (summaKredita * koeff);
        return result;
    }
}

public class CreditPaymentService {
    public int calculate(int summaKredita, double procent, int year) {
        int month = year * 12;
        double monthlyRate = procent / 12 / 100;
        double koeff = monthlyRate * ((Math.pow((1 + monthlyRate), month)) / ((Math.pow(1 + monthlyRate, month)) - 1));
        int result = (int) (summaKredita * koeff);
        return result;
    }
}

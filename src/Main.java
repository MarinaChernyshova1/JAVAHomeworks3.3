public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Считаем ежемесячный платёж " +
                " если сумма кредита " + 1_000_000 +
                " процентная ставка " + 9.99 + "%" +
                " срок кредитования " + 12 + " месяцев");
        System.out.println(service.calculate(1000000, 9.99, 12));

    }
}
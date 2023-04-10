public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Считаем ежемесячный платёж " +
                " если сумма кредита " + 1_000_000 +
                " процентная ставка " + 9.99 + "%" +
                " срок кредитования " + 1 + " год(а)");
        System.out.println(service.calculate(1000000, 9.99, 1));
        System.out.println();
        System.out.println("Считаем ежемесячный платёж " +
                " если сумма кредита " + 1_000_000 +
                " процентная ставка " + 9.99 + "%" +
                " срок кредитования " + 2 + " год(а)");
        System.out.println(service.calculate(1000000, 9.99, 2));
        System.out.println();
        System.out.println("Считаем ежемесячный платёж " +
                " если сумма кредита " + 1_000_000 +
                " процентная ставка " + 9.99 + "%" +
                " срок кредитования " + 3 + " год(а)");
        System.out.println(service.calculate(1000000, 9.99, 3));

    }
}
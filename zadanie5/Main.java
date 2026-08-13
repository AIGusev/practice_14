package practice_14.zadanie5;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Payment creditCard = new CreditCard();
        Payment payPal = new PayPal();
        Payment bitcoin = new Bitcoin();


        System.out.println("Оплата Кредиткой");
        paymentProcessor.paymentProcessor(creditCard, 10000.0);
        System.out.println("Оплата ПэйПал");
        paymentProcessor.paymentProcessor(payPal, 20000.0);
        System.out.println("Оплата Криптой");
        paymentProcessor.paymentProcessor(bitcoin, 10.0);
    }
}

package practice_14.zadanie5;

public class PayPal implements Payment{

    @Override
    public void pay(double amount) {

        System.out.println("Оплата по ПэйПалу: " + amount);
    }
}

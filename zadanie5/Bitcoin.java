package practice_14.zadanie5;

public class Bitcoin implements Payment{

    @Override
    public void pay(double amount) {

        System.out.println("Оплата по крипте: " + amount);
    }
}

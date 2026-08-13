package practice_14.zadanie4;

public class Main {
   public static void main(String[] args) {
        Order order = new Order("123", "Car", 10000000.0, "artem@gmail.com");
        Email email = new Email();
        GenerateInvoice generateInvoice = new GenerateInvoice();

        Manager manager = new Manager(email, generateInvoice);

        manager.zakaz(order);
    }
}

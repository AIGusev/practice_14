package practice_14.zadanie4;

public class Manager {

    private  Email email;
    private GenerateInvoice generateInvoice;

    public Manager(Email email, GenerateInvoice generateInvoice) {
        this.email = email;
        this.generateInvoice = generateInvoice;
    }

    public void zakaz (Order order) {

        order.processOrder();

        generateInvoice.generateInvoice(order.getOrderId(), order.getProductName(), order.getPrice());

        email.sendEmailConfirmation(order.getEmail());
    }
}

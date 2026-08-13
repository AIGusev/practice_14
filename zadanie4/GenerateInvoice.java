package practice_14.zadanie4;

public class GenerateInvoice {
    public void generateInvoice(String getOrderId, String getProductName, double getPrice) {
        System.out.println("Генерируем счет " + getOrderId);
        System.out.println("Наименование товара " + getProductName);
        System.out.println("Сумма " + getPrice);
        System.out.println("Счет сгенерирован!");
    }
}

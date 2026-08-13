package practice_14.zadanie8;

public class EmailSender implements Message{

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка email: " + message);
    }
}

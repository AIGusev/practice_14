package practice_14.zadanie8;

public class Main {
    public static void main(String[] args) {

        Message message = new EmailSender();
        NotificationService notificationService = new NotificationService(message);
        notificationService.sendNotification("Отправлено");
    }
}

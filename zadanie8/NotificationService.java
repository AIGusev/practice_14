package practice_14.zadanie8;

public class NotificationService {

    private Message message;

    public NotificationService(Message message) {
        this.message = message;
    }
    public void sendNotification(String message) {
       this.message.sendMessage(message);
    }
}

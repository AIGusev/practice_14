package practice_14.zadanie3;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isPremiumMember;
    private int rewardPoints;
    private String preferredLanguage;
    private String homeAddress;
    private String workAddress;
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}


// Я не очень понял что мне тут делать! Мне нужно дописывать код? геттеры и сеттеры и проверять его потом?
// Я просто удалил строку  private String socialSecurityNumber; у которой был комментарий "Никогда не используется"
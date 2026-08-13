package practice_14.zadanie6;

public class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Я Кавальски");
    }
}

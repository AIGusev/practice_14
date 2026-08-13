package practice_14.zadanie6;

public class Lastochka extends Bird implements Flyable{
    public Lastochka(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirik");
    }

    @Override
    public void fly() {
        System.out.println(name + " ЛЕТИТ!");
    }
}

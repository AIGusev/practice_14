package practice_14.zadanie6;

public abstract class Bird {

    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

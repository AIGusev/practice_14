package practice_14.zadanie7;

public class Programmer2 implements Workable, Eatable{

    @Override
    public void eat() {
        System.out.println("Программист ест на работе");
    }

    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
}

package practice_14.zadanie1;

public class MathOperations {

    public int add(int... numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

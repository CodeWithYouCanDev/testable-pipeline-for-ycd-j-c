package youcandev.mentoring.java_syntax._04_loops._09_not_divisible_by_3;

/*
Nie podzielne przez 3
 */
public class NotDivisibleBy3 {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);

    }
}

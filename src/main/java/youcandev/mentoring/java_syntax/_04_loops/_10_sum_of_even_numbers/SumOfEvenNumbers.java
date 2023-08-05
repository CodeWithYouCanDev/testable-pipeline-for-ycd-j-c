package youcandev.mentoring.java_syntax._04_loops._10_sum_of_even_numbers;

/*
Suma liczb parzystych
 */
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        int count = 1;
        int sum = 0;
        while (count <= 100) {
            if (count % 2 == 0) {
                sum += count;
            }
            count++;
        }
        System.out.println(sum);
    }
}

package youcandev.mentoring.java_syntax._06_arrays._05_sum_of_odd_and_even_elements;

/*
Suma parzystych i nieparzystych elementów tablicy
 */
public class SumOfOddAndEvenElements {
    public static int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                x += array[i];
            } else {
                y += array[i];
            }
        }
        System.out.println(x + "; " + y);
    }
}

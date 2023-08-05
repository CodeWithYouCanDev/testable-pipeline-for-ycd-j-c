package youcandev.mentoring.java_syntax._07_functions._15_array_in_the_program;

/*
Tablica w programie
 */
public class ArrayInTheProgram {

    public static void main(String[] args) {
        int[] array = {546, 123, -15, 87, 654, 98};
        System.out.println("W tablice: ");
        printArray(array);
        System.out.println("Minimalna liczba: " + getMinValue(array));
        System.out.println("Maksymalna liczba: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

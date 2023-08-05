package youcandev.mentoring.java_syntax._07_functions._07_array_utility;

/*
Narzędzie do pracy z tablicami
 */
public class ArrayUtility {

    public static void main(String[] args) {
        int[] array = {44, 55, 56, 76, 86, 90, 105, 110};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //napisz tutaj swój kod
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

package youcandev.mentoring.java_syntax._06_arrays._19_initialization_and_filling_multi_array;

/*
Inicjalizacja i wypełnianie tablicy dwuwymiarowej
 */
public class InitializationAndFillingMultiArray {

    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[2 * i + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

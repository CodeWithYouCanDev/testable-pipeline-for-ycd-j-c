package youcandev.mentoring.java_syntax._06_arrays._15_creating_triangle_array;

/*
Tworzenie Trójkątnej Tablicy
 */
public class CreatingTriangleArray {

    public static int[][] array = new int[10][];

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

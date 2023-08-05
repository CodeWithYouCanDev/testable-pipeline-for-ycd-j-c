package youcandev.mentoring.java_syntax._06_arrays._04_sign_change_for_even;

/*
Zmiana znaku dla liczb parzystch
 */
public class SignChangeForEven {
    public static int[] array = new int[]{-3, 5, 6, -4, 2, 100};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] * -1;
            }
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
    }
}

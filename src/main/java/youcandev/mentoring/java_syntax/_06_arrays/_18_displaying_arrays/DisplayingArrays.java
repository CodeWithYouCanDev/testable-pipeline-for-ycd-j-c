package youcandev.mentoring.java_syntax._06_arrays._18_displaying_arrays;

import java.util.Arrays;

/*
Wyświetlanie tablic
 */
public class DisplayingArrays {

    public static String[] strings = new String[]{"You", "Can", "Dev"};
    public static int[] ints = new int[]{10, 12, 14, 16, 18, 20, 22, 24};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}

package youcandev.mentoring.java_syntax._06_arrays._03_array_initialization_based_on_index;

/*
Inicjalizacja Tablicy na podstawie indeksu
 */
public class ArrayInitializationBasedOnIndex {
    public static final String ODD = "Parzysta";
    public static final String EVEN = "Nieparzysta";
    public static String[] strings = new String[7];

    public static void main(String[] args) {
        //napisz tutaj swój kod
        strings[0] = ODD;
        strings[1] = EVEN;
        strings[2] = ODD;
        strings[3] = EVEN;
        strings[4] = ODD;
        strings[5] = EVEN;
        strings[6] = ODD;

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
        System.out.print("index = 5");
        System.out.println(" value = " + strings[5]);
        System.out.print("index = 6");
        System.out.println(" value = " + strings[6]);
    }
}

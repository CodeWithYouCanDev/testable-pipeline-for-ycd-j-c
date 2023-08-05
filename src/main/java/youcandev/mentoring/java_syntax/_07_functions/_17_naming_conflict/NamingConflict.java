package youcandev.mentoring.java_syntax._07_functions._17_naming_conflict;

/*
Konflikt nazw zmiennych
 */
public class NamingConflict {

    public static void main(String[] args) {
        int[] array = {81, 49, 121, 35, 16};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtInfo = "Pierwiastek kwadratowy z liczby ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtInfo + element + " wynosi " + elementSqrt);
        }
    }
}

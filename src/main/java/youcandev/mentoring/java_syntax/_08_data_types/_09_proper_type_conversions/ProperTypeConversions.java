package youcandev.mentoring.java_syntax._08_data_types._09_proper_type_conversions;

/*
Prawidłowe konwersje typów
 */
public class ProperTypeConversions {
    public static void main(String[] args) {
        int a = (short) 100 + 129;
        int b = 50000 + 10;
        int c = 100_000;
        long d = 1_000_000_000_000L;

        long sum = a + b + c + d;
        System.out.println("Sum: " + sum);
    }
}

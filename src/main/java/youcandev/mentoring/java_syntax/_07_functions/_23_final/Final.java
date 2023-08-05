package youcandev.mentoring.java_syntax._07_functions._23_final;

/*
Słowo kluczowe final
 */
public class Final {

    public static final double PI = 3.14;
    public static final double RADIUS = 2.5;
    public static final double DIAMETER = 5;

    public static void main(String[] args) {
        System.out.println("Pole powierzchni koła wynosi: " + PI * RADIUS * RADIUS);
        System.out.println("Obwód koła wynosi: " + PI * DIAMETER);
    }
}

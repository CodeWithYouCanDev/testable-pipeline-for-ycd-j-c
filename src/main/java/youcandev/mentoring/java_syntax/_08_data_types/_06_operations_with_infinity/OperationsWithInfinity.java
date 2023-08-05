package youcandev.mentoring.java_syntax._08_data_types._06_operations_with_infinity;

/*
Praca z Infinity
 */
public class OperationsWithInfinity {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        div(0.0, 5);
        div(0.0, -5);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}

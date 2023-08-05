package youcandev.mentoring.java_syntax._09_useful_nuances._16_swap_values;

/*
Zamiana wartości
 */
public class SwapValues {
    public static void main(String[] args) {
        /* expected output
        x=10, y=15
        x=15, y=10
         */

        Point point = new Point(4, 5);
        System.out.println(point);
        point.swap();
        System.out.println(point);
    }
}

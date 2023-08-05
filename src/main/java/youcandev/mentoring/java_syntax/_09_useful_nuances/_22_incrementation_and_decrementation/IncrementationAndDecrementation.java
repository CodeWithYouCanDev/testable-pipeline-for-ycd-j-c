package youcandev.mentoring.java_syntax._09_useful_nuances._22_incrementation_and_decrementation;

/*
Inkrementacja i dekrementacja
 */
public class IncrementationAndDecrementation {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}

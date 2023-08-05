package youcandev.mentoring.java_syntax._09_useful_nuances._02_using_math_class;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsingMathClassTest {

    @Test
    void testSqrt() {
        assertEquals(0, UsingMathClass.sqrt(0), 1e-9); // square root of 0 is 0
        assertEquals(1, UsingMathClass.sqrt(1), 1e-9); // square root of 1 is 1
        assertEquals(2, UsingMathClass.sqrt(4), 1e-9); // square root of 4 is 2
        assertEquals(3, UsingMathClass.sqrt(9), 1e-9); // square root of 9 is 3
    }

    @Test
    void testCbrt() {
        assertEquals(0, UsingMathClass.cbrt(0), 1e-9); // cube root of 0 is 0
        assertEquals(1, UsingMathClass.cbrt(1), 1e-9); // cube root of 1 is 1
        assertEquals(2, UsingMathClass.cbrt(8), 1e-9); // cube root of 8 is 2
        assertEquals(-2, UsingMathClass.cbrt(-8), 1e-9); // cube root of -8 is -2
    }

    @Test
    void testPow() {
        assertEquals(1, UsingMathClass.pow(0, 0), 1e-9); // 0^0 is 1 by convention
        assertEquals(0, UsingMathClass.pow(0, 1), 1e-9); // 0^1 is 0
        assertEquals(1, UsingMathClass.pow(1, 0), 1e-9); // 1^0 is 1
        assertEquals(2, UsingMathClass.pow(2, 1), 1e-9); // 2^1 is 2
        assertEquals(4, UsingMathClass.pow(2, 2), 1e-9); // 2^2 is 4
        assertEquals(8, UsingMathClass.pow(2, 3), 1e-9); // 2^3 is 8
    }
}

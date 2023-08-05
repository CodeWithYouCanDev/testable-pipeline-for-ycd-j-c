package youcandev.mentoring.java_syntax._09_useful_nuances._01_trigonometric_functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrigonometricFunctionsTest {

    @Test
    void testSin() {
        assertEquals(0, TrigonometricFunctions.sin(0), 1e-9); // sin(0°) = 0
        assertEquals(1, TrigonometricFunctions.sin(90), 1e-9); // sin(90°) = 1
        assertEquals(0, TrigonometricFunctions.sin(180), 1e-9); // sin(180°) = 0
        assertEquals(-1, TrigonometricFunctions.sin(270), 1e-9); // sin(270°) = -1
        assertEquals(0, TrigonometricFunctions.sin(360), 1e-9); // sin(360°) = 0
    }

    @Test
    void testCos() {
        assertEquals(1, TrigonometricFunctions.cos(0), 1e-9); // cos(0°) = 1
        assertEquals(0, TrigonometricFunctions.cos(90), 1e-9); // cos(90°) = 0
        assertEquals(-1, TrigonometricFunctions.cos(180), 1e-9); // cos(180°) = -1
        assertEquals(0, TrigonometricFunctions.cos(270), 1e-9); // cos(270°) = 0
        assertEquals(1, TrigonometricFunctions.cos(360), 1e-9); // cos(360°) = 1
    }

    @Test
    void testTan() {
        assertEquals(0, TrigonometricFunctions.tan(0), 1e-9); // tan(0°) = 0

        // Check if the absolute value of tan(90°) is very large
        assertTrue(Math.abs(TrigonometricFunctions.tan(90)) > 1e9);

        assertEquals(0, TrigonometricFunctions.tan(180), 1e-9); // tan(180°) = 0

        // Check if the absolute value of tan(270°) is very large
        assertTrue(Math.abs(TrigonometricFunctions.tan(270)) > 1e9);

        assertEquals(0, TrigonometricFunctions.tan(360), 1e-9); // tan(360°) = 0
    }

}

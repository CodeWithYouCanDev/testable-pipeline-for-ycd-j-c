package youcandev.mentoring.java_syntax._07_functions._11_power_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    @Test
    void testCube() {
        assertEquals(1, PowerCalculator.cube(1));       // 1^3 = 1
        assertEquals(8, PowerCalculator.cube(2));       // 2^3 = 8
        assertEquals(27, PowerCalculator.cube(3));      // 3^3 = 27
        assertEquals(1000, PowerCalculator.cube(10));   // 10^3 = 1000
        assertEquals(9261, PowerCalculator.cube(21));   // 21^3 = 9261
    }
}

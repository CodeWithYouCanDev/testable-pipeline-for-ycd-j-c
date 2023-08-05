package youcandev.mentoring.java_syntax._07_functions._12_power_calculator_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculator2Test {

    @Test
    void testCube() {
        assertEquals(1, PowerCalculator2.cube(1));      // 1^3 = 1
        assertEquals(8, PowerCalculator2.cube(2));      // 2^3 = 8
        assertEquals(27, PowerCalculator2.cube(3));     // 3^3 = 27
        assertEquals(1000, PowerCalculator2.cube(10));  // 10^3 = 1000
        assertEquals(9261, PowerCalculator2.cube(21));  // 21^3 = 9261
    }

    @Test
    void testNinthDegree() {
        assertEquals(1, PowerCalculator2.ninthDegree(1));        // 1^9 = 1
        assertEquals(512, PowerCalculator2.ninthDegree(2));      // 2^9 = 512
        assertEquals(19683, PowerCalculator2.ninthDegree(3));    // 3^9 = 19683
        assertEquals(1000000000, PowerCalculator2.ninthDegree(10));  // 10^9 = 1000000000
    }
}

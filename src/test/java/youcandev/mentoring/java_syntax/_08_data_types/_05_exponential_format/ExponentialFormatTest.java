package youcandev.mentoring.java_syntax._08_data_types._05_exponential_format;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialFormatTest {

    @Test
    void testEarthDiameter() {
        ExponentialFormat format = new ExponentialFormat();
        double expected = 12742.0;
        assertEquals(expected, format.earthDiameter, 1e-6);
        assertTrue(isMantissaInRange(format.earthDiameter));
    }

    @Test
    void testLightSpeed() {
        ExponentialFormat format = new ExponentialFormat();
        double expected = 299792458.0;
        assertEquals(expected, format.lightSpeed, 1e-6);
        assertTrue(isMantissaInRange(format.lightSpeed));
    }

    @Test
    void testUraniumAtomicMass() {
        ExponentialFormat format = new ExponentialFormat();
        double expected = 238.0289;
        assertEquals(expected, format.uraniumAtomicMass, 1e-6);
        assertTrue(isMantissaInRange(format.uraniumAtomicMass));
    }

    @Test
    void testAverageBeeWeight() {
        ExponentialFormat format = new ExponentialFormat();
        double expected = 0.085;
        assertEquals(expected, format.averageBeeWeight, 1e-6);
        assertFalse(isMantissaInRange(format.averageBeeWeight));
    }

    @Test
    void testJavaDeveloperSalary() {
        ExponentialFormat format = new ExponentialFormat();
        double expected = 10000.0;
        assertEquals(expected, format.javaDeveloperSalary, 1e-6);
        assertTrue(isMantissaInRange(format.javaDeveloperSalary));
    }

    private boolean isMantissaInRange(double value) {
        while (value >= 10.0) {
            value /= 10.0;
        }
        return value >= 1.0;
    }
}

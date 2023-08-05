package youcandev.mentoring.java_syntax._09_useful_nuances._17_digital_anomaly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitalAnomalyTest {

    @Test
    void testChangeBitActivatedTrue() {
        assertEquals(0b111, DigitalAnomaly.changeBit(0b101, 0b10, true)); // Expected 7
        assertEquals(0b111, DigitalAnomaly.changeBit(0b110, 0b1, true)); // Expected 7
        assertEquals(0b1001, DigitalAnomaly.changeBit(0b1001, 0b1000, true)); // Expected 9
    }

    @Test
    void testChangeBitActivatedFalse() {
        assertEquals(0b11, DigitalAnomaly.changeBit(0b10011, 0b10000, false)); // Expected 3
        assertEquals(0b111011, DigitalAnomaly.changeBit(0b111111, 0b100, false)); // Expected 59
        assertEquals(0b10001010, DigitalAnomaly.changeBit(0b10101010, 0b100000, false)); // Expected 138
    }
}

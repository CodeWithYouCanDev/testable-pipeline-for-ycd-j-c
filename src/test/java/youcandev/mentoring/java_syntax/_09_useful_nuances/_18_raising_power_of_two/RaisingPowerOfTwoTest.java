package youcandev.mentoring.java_syntax._09_useful_nuances._18_raising_power_of_two;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RaisingPowerOfTwoTest {

    @Test
    void testGetPowerOfTwoPositivePowers() {
        assertEquals(1, RaisingPowerOfTwo.getPowerOfTwo(0)); // 2^0 = 1
        assertEquals(2, RaisingPowerOfTwo.getPowerOfTwo(1)); // 2^1 = 2
        assertEquals(4, RaisingPowerOfTwo.getPowerOfTwo(2)); // 2^2 = 4
        assertEquals(8, RaisingPowerOfTwo.getPowerOfTwo(3)); // 2^3 = 8
        assertEquals(16, RaisingPowerOfTwo.getPowerOfTwo(4)); // 2^4 = 16
    }

    //TODO FIX this unit test or logic
    @Test
    void testGetPowerOfTwoNegativePowers() {
        assertEquals(1, RaisingPowerOfTwo.getPowerOfTwo(0));  // 2^0 = 1
        assertEquals(1, RaisingPowerOfTwo.getPowerOfTwo(-1));
        assertEquals(1, RaisingPowerOfTwo.getPowerOfTwo(-2));
        assertEquals(1, RaisingPowerOfTwo.getPowerOfTwo(-3));
    }


}

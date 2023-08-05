package youcandev.mentoring.java_syntax._09_useful_nuances._19_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitManipulationTest {

    @Test
    void testSetFlag() {
        assertEquals(1, BitManipulation.setFlag(0, 0));    // Setting the 0th bit of 0 should result in 1
        assertEquals(3, BitManipulation.setFlag(1, 1));    // Setting the 1st bit of 1 should result in 3 (11 in binary)
        assertEquals(5, BitManipulation.setFlag(1, 2));    // Setting the 2nd bit of 1 should result in 5 (101 in binary)
    }

    @Test
    void testResetFlag() {
        assertEquals(0, BitManipulation.resetFlag(1, 0));    // Resetting the 0th bit of 1 should result in 0
        assertEquals(1, BitManipulation.resetFlag(3, 1));    // Resetting the 1st bit of 3 should result in 1 (01 in binary)
        assertEquals(3, BitManipulation.resetFlag(7, 2));    // Resetting the 2nd bit of 7 should result in 3 (011 in binary)
    }

    @Test
    void testCheckFlag() {
        assertFalse(BitManipulation.checkFlag(0, 0));    // 0th bit of 0 is not set
        assertTrue(BitManipulation.checkFlag(1, 0));     // 0th bit of 1 is set
        assertTrue(BitManipulation.checkFlag(3, 1));     // 1st bit of 3 is set
        assertFalse(BitManipulation.checkFlag(1, 1));    // 1st bit of 1 is not set
    }
}

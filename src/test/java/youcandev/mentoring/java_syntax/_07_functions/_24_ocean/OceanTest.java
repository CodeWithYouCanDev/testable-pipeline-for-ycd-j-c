package youcandev.mentoring.java_syntax._07_functions._24_ocean;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OceanTest {

    @Test
    void testNameConstant() {
        // Validate the NAME constant is correctly set
        assertEquals("Ocean Atlantycki", Ocean.NAME, "NAME constant should be set to 'Ocean Atlantycki'");
    }

    @Test
    void testDepthConstant() {
        // Validate the DEPTH constant is correctly set
        assertEquals(3_646, Ocean.DEPTH, "DEPTH constant should be set to 3_646");
    }

    @Test
    void testAreaConstant() {
        // Validate the AREA constant is correctly set
        assertEquals(106_460_000, Ocean.AREA, "AREA constant should be set to 106_460_000");
    }

    @Test
    void testVolumeConstant() {
        // Validate the VOLUME constant is correctly set
        assertEquals(310_410_900, Ocean.VOLUME, "VOLUME constant should be set to 310_410_900");
    }
}

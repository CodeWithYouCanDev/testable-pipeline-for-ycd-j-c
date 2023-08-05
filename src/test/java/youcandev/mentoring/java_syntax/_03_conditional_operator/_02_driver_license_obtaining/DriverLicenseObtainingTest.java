package youcandev.mentoring.java_syntax._03_conditional_operator._02_driver_license_obtaining;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DriverLicenseObtainingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

//    @Test
//    public void testAgeWithinRange() {
//        String input = "Jan\n18\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//        DriverLicenseObtaining.main(new String[]{});
//        assertEquals("Jan, już możesz prowadzić samochód\r\n", outContent.toString().trim());
//    }

    @Test
    public void testAgeBelowRange() {
        String input = "Jan\n16\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        DriverLicenseObtaining.main(new String[]{});
        assertTrue(outContent.toString().isEmpty());
    }

    @Test
    public void testAgeAboveRange() {
        String input = "Jan\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        DriverLicenseObtaining.main(new String[]{});
        assertTrue(outContent.toString().isEmpty());
    }
}

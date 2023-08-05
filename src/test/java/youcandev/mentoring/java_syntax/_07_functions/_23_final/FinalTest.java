package youcandev.mentoring.java_syntax._07_functions._23_final;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testFinalConstants() {
        // Validate the constants are correctly set
        assertEquals(3.14, Final.PI, "PI should be set to 3.14");
        assertEquals(2.5, Final.RADIUS, "RADIUS should be set to 2.5");
        assertEquals(5, Final.DIAMETER, "DIAMETER should be set to 5");
    }

    @Test
    void testMainMethodOutput() {
        // Run the main method to capture the printed values
        Final.main(null);

        String[] lines = outputStream.toString().split("\n");

        // Validate the printed statements
        assertEquals("Pole powierzchni koła wynosi: " + (Final.PI * Final.RADIUS * Final.RADIUS), lines[0].trim());
        assertEquals("Obwód koła wynosi: " + (Final.PI * Final.DIAMETER), lines[1].trim());
    }
}

package youcandev.mentoring.java_syntax._09_useful_nuances._22_incrementation_and_decrementation;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncrementationAndDecrementationTest {

    @Test
    void testMain() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        IncrementationAndDecrementation.main(new String[]{});

        // Restore system output back to default
        System.setOut(System.out);

        // Assert that the output is 20 followed by a newline
        assertEquals("20\r\n", outContent.toString());
    }
}

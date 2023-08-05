package youcandev.mentoring.java_syntax._09_useful_nuances._16_swap_values;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SwapValuesTest {

    @Test
    public void testMainOutput() {
        // Capture the standard output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SwapValues.main(null);

        String expectedOutput = "x=4, y=5" + System.lineSeparator() + "x=5, y=4" + System.lineSeparator();  // Expected output
        assertEquals(expectedOutput, outContent.toString());

        // Reset the standard output to console
        System.setOut(System.out);
    }
}

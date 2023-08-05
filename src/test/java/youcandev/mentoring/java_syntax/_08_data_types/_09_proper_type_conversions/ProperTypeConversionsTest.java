package youcandev.mentoring.java_syntax._08_data_types._09_proper_type_conversions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProperTypeConversionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testOutputIsCorrect() {
        ProperTypeConversions.main(null);
        String output = outContent.toString().trim();
        assertEquals("Sum: 1000000150239", output, "Expected output to be 'Sum: 1000000150239'");
    }
}

package youcandev.mentoring.java_syntax._08_data_types._06_operations_with_infinity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class OperationsWithInfinityTest {

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
    void testDivMethodOutputs() {
        OperationsWithInfinity.main(null);
        String[] lines = outContent.toString().split(System.lineSeparator());
        assertTrue(lines.length == 2, "Expected 2 lines of output");
        assertTrue("Infinity".equals(lines[0].trim()), "Expected first output to be 'Infinity'");
        assertTrue("-Infinity".equals(lines[1].trim()), "Expected second output to be '-Infinity'");
    }
}

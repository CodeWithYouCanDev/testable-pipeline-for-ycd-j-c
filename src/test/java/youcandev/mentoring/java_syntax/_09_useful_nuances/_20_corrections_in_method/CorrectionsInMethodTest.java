package youcandev.mentoring.java_syntax._09_useful_nuances._20_corrections_in_method;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrectionsInMethodTest {

    @Test
    void testTaskForCondition() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CorrectionsInMethod.taskForCondition();

        // Restore system output back to default
        System.setOut(System.out);

        // Assert that the output is 30 followed by a newline
        assertEquals("32\r\n", outContent.toString());
    }
}

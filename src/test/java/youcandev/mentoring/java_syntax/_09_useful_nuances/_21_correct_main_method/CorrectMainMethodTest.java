package youcandev.mentoring.java_syntax._09_useful_nuances._21_correct_main_method;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrectMainMethodTest {

    @Test
    void testMain() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CorrectMainMethod.main(new String[]{});

        // Restore system output back to default
        System.setOut(System.out);

        // Assert that the output is 12 followed by a newline
        assertEquals("12\r\n", outContent.toString());
    }
}

package youcandev.mentoring.java_syntax._09_useful_nuances._15_comment_lines;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentLinesTest {

    @Test
    public void testMainOutput() {
        // Capture the standard output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CommentLines.main(null);

        String expectedOutput = "5" + System.lineSeparator();  // Expected output is 5 followed by a newline
        assertEquals(expectedOutput, outContent.toString());

        // Reset the standard output to console
        System.setOut(System.out);
    }
}

package youcandev.mentoring.java_syntax._04_loops._08_enough;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnoughTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testUntilEnough() {
        String input = "hello\nworld\nenough\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Enough.main(new String[]{});

        String expectedOutput = "hello\r\nworld\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testImmediateEnough() {
        String input = "enough\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Enough.main(new String[]{});

        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }
}

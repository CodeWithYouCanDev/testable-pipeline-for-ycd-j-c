package youcandev.mentoring.java_syntax._03_conditional_operator._17_strings_comparing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsComparingTest {

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
    void testSameStrings() {
        String input = "Hello\nHello\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StringsComparing.main(null);
        String expectedOutput = "linie są takie same\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDifferentStrings() {
        String input = "Hello\nWorld\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StringsComparing.main(null);
        String expectedOutput = "linie są różne\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

package youcandev.mentoring.java_syntax._03_conditional_operator._07_three_digits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeDigitsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testAllNumbersSame() {
        String input = "2\n2\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ThreeDigits.main(new String[]{});
        assertEquals("2 2 2", outContent.toString().trim());
    }

    @Test
    void testTwoNumbersSame() {
        String input = "1\n2\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ThreeDigits.main(new String[]{});
        assertEquals("2 2", outContent.toString().trim());
    }

    @Test
    void testNoNumbersSame() {
        String input = "1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ThreeDigits.main(new String[]{});
        assertEquals("", outContent.toString().trim());
    }

    @Test
    void testDifferentPairs() {
        String input = "2\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ThreeDigits.main(new String[]{});
        assertEquals("2 2", outContent.toString().trim());

        outContent.reset();  // Reset the output stream content for the next test

        input = "2\n3\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ThreeDigits.main(new String[]{});
        assertEquals("2 2", outContent.toString().trim());

        outContent.reset();  // Reset the output stream content for the next test

        input = "3\n2\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ThreeDigits.main(new String[]{});
        assertEquals("2 2", outContent.toString().trim());
    }
}

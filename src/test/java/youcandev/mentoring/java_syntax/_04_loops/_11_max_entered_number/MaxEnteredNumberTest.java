package youcandev.mentoring.java_syntax._04_loops._11_max_entered_number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxEnteredNumberTest {

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
    void testMaxEnteredNumber() {
        String input = "8\n9\n8\n4\n5\ne\n";
        int expectedOutput = 8;  // Since 8 is the highest even number entered.

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MaxEnteredNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    @Test
    void testNoEvenNumbersEntered() {
        String input = "1\n3\n5\ne\n";
        int expectedOutput = Integer.MIN_VALUE;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MaxEnteredNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    @Test
    void testOnlyOneNonNumericSymbolEntered() {
        String input = "e\n";
        int expectedOutput = Integer.MIN_VALUE;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MaxEnteredNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }
}

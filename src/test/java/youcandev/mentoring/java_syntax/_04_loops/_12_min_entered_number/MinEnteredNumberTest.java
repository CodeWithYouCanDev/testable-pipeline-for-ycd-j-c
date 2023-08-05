package youcandev.mentoring.java_syntax._04_loops._12_min_entered_number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinEnteredNumberTest {

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
    void testMinEnteredNumber() {
        String input = "8\n9\n8\n4\n5\ne\n";
        int expectedOutput = 4;  // Since 4 is the smallest number entered.

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MinEnteredNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    @Test
    void testNoNumbersEntered() {
        String input = "e\n";
        int expectedOutput = Integer.MAX_VALUE;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MinEnteredNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    @Test
    void testSameNumbersEntered() {
        String input = "8\n8\n8\ne\n";
        int expectedOutput = 8;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MinEnteredNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }
}

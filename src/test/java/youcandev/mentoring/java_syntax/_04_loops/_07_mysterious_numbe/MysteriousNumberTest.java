package youcandev.mentoring.java_syntax._04_loops._07_mysterious_numbe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MysteriousNumberTest {

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
    void testCorrectGuess() {
        String input = "3\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        MysteriousNumber.main(new String[]{});

        String expectedOutput = "Wprowadż liczbę całkowitą:\r\nTajemnicza liczba to 3\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testIncorrectThenCorrectGuess() {
        String input = "2\r\n3\r\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        MysteriousNumber.main(new String[]{});

        String expectedOutput = "Wprowadż liczbę całkowitą:\r\nSpróbuj jeszcze raz\r\nTajemnicza liczba to 3\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

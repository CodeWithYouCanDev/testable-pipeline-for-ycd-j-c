package youcandev.mentoring.java_syntax._07_functions._01_learn_java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LearnJavaTest {

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
    void testMainMethodOutput() {
        LearnJava.main(new String[]{});

        String expectedOutput = "Cześć, jestem Java developerem!" + System.lineSeparator() +
                "Uczę się języka Java z YouCanDev" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testShowMessageMethodOutput() {
        LearnJava.showMessage();

        String expectedOutput = "Uczę się języka Java z YouCanDev" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}

package youcandev.mentoring.java_syntax._03_conditional_operator._18_comparison_by_reference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComparisonByReferenceTest {

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
    void testStringReferences() {
        ComparisonByReference.main(null);

        String expectedOutput = "referencje są takie same\r\n" +
                "referencje są takie same\r\n" +
                "referencje są takie same\r\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}

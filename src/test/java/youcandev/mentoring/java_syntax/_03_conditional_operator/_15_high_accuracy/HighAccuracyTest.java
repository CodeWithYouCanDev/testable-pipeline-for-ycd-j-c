package youcandev.mentoring.java_syntax._03_conditional_operator._15_high_accuracy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighAccuracyTest {

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
    void testNumbersAreEqualWithHighAccuracy() {
        System.setIn(new ByteArrayInputStream("1.0000001\n1.0000002\n".getBytes()));
        HighAccuracy.main(null);
        assertEquals("liczby są równe\r\n", outContent.toString());
    }

    @Test
    void testNumbersAreNotEqual() {
        System.setIn(new ByteArrayInputStream("1.0\n1.000002\n".getBytes()));
        HighAccuracy.main(null);
        assertEquals("liczby nie są równe\r\n", outContent.toString());
    }

    @Test
    void testSameNumbersAreEqual() {
        System.setIn(new ByteArrayInputStream("5.5\n5.5\n".getBytes()));
        HighAccuracy.main(null);
        assertEquals("liczby są równe\r\n", outContent.toString());
    }
}

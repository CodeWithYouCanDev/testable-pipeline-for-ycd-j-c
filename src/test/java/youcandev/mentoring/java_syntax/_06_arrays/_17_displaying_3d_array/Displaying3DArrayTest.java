package youcandev.mentoring.java_syntax._06_arrays._17_displaying_3d_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Displaying3DArrayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent)); // redirect the standard output to the outContent stream
    }

    @Test
    void testArrayDisplay() {
        Displaying3DArray.main(new String[]{});

        String expectedOutput =
                "10 23 41 \r\n" +
                        "13 \r\n" +
                        "----------\r\n" +
                        "41 53 \r\n" +
                        "\r\n" +
                        "----------\r\n" +
                        "2 \r\n" +
                        "5 \r\n" +
                        "1 \r\n" +
                        "6 8 \r\n" +
                        "----------\r\n";

        assertEquals(expectedOutput, outContent.toString(), "The displayed multiArray does not match the expected output.");
    }

    // You can add other tests if there are other functionalities or edge cases you wish to cover.
}

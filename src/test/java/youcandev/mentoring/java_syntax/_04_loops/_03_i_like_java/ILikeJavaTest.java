package youcandev.mentoring.java_syntax._04_loops._03_i_like_java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ILikeJavaTest {

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
    void testPrintNameAndTextTenTimes() {
        String testName = "Anna";
        System.setIn(new ByteArrayInputStream(testName.getBytes()));

        ILikeJava.main(new String[]{});

        long count = outContent.toString()
                .lines()
                .filter(line -> (testName + " lubi Jave").equals(line))
                .count();

        assertTrue(count == 10, "The message '" + testName + " lubi Jave' should be printed 10 times.");
    }
}

package youcandev.mentoring.java_syntax._06_arrays._09_finding_the_smallest_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindingTheSmallestNumberTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testFindSmallestNumber() {
        String input = "5\n10\n25\n5\n15\n20\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FindingTheSmallestNumber.main(new String[]{});

        String expectedOutput = "5\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testOnlyOneNumber() {
        String input = "1\n7\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FindingTheSmallestNumber.main(new String[]{});

        String expectedOutput = "7\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}

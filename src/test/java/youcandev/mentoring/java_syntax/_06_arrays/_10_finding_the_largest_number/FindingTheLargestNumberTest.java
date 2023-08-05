package youcandev.mentoring.java_syntax._06_arrays._10_finding_the_largest_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FindingTheLargestNumberTest {

    @Test
    void testFindingTheLargestNumber() {
        String input = "5\n1\n2\n3\n4\n5\n"; // 5 numbers from 1 to 5
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FindingTheLargestNumber.main(new String[]{});

        String expectedOutput = "5\r\n"; // The largest number from 1 to 5 is 5
        assertEquals(expectedOutput, out.toString());
    }

    @Test
    void testNegativeNumbers() {
        String input = "4\n-5\n-3\n-8\n-1\n"; // 4 negative numbers
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FindingTheLargestNumber.main(new String[]{});

        String expectedOutput = "-1\r\n"; // The largest number among these negatives is -1
        assertEquals(expectedOutput, out.toString());
    }

    // You can add more tests as needed, for various scenarios.
}

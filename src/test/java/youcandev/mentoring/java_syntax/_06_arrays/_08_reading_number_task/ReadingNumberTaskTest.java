package youcandev.mentoring.java_syntax._06_arrays._08_reading_number_task;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ReadingNumberTaskTest {

    @Test
    void testOddK() {
        String input = "5\n1\n2\n3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ReadingNumberTask.main(new String[]{});

        String expectedOutput = "1\r\n2\r\n3\r\n4\r\n5\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEvenK() {
        String input = "4\n1\n2\n3\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ReadingNumberTask.main(new String[]{});

        String expectedOutput = "4\r\n3\r\n2\r\n1\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

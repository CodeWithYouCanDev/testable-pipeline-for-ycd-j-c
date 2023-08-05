package youcandev.mentoring.java_syntax._03_conditional_operator._10_work_or_do_not_work;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkOrDoNotWorkTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testAgeBelow20() {
        String input = "19\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkOrDoNotWork.main(new String[]{});
        assertEquals("nie trzeba pracować", outContent.toString().trim());
    }

    @Test
    void testAgeAbove60() {
        String input = "61\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkOrDoNotWork.main(new String[]{});
        assertEquals("nie trzeba pracować", outContent.toString().trim());
    }

    @Test
    void testAgeBetween20And60Inclusive() {
        String input = "40\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkOrDoNotWork.main(new String[]{});
        assertEquals("", outContent.toString().trim());
    }

    @Test
    void testAgeExactly20() {
        String input = "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkOrDoNotWork.main(new String[]{});
        assertEquals("", outContent.toString().trim());
    }

    @Test
    void testAgeExactly60() {
        String input = "60\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkOrDoNotWork.main(new String[]{});
        assertEquals("", outContent.toString().trim());
    }
}

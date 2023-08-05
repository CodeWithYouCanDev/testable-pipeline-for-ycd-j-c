package youcandev.mentoring.java_syntax._03_conditional_operator._04_school_or_university;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SchoolOrUniversityTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testAgeBelowSix() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SchoolOrUniversity.main(new String[]{});
        assertTrue(outContent.toString().isEmpty());
    }

    @Test
    public void testAgeEqualsSix() {
        String input = "6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SchoolOrUniversity.main(new String[]{});
        assertEquals("powinieneś chodzić do szkoły", outContent.toString().trim());
    }

    @Test
    public void testAgeWithinSchoolRange() {
        String input = "10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SchoolOrUniversity.main(new String[]{});
        assertEquals("powinieneś chodzić do szkoły", outContent.toString().trim());
    }

    @Test
    public void testAgeEqualsEighteen() {
        String input = "18\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SchoolOrUniversity.main(new String[]{});
        assertEquals("czas na uniwersytet", outContent.toString().trim());
    }

    @Test
    public void testAgeAboveEighteen() {
        String input = "25\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SchoolOrUniversity.main(new String[]{});
        assertEquals("czas na uniwersytet", outContent.toString().trim());
    }
}

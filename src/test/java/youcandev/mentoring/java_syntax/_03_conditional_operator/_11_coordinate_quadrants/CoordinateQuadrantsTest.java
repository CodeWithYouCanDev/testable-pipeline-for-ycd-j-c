package youcandev.mentoring.java_syntax._03_conditional_operator._11_coordinate_quadrants;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordinateQuadrantsTest {

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
    void testFirstQuadrant() {
        String input = "4 6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        CoordinateQuadrants.main(new String[]{});
        assertEquals("1", outContent.toString().trim());
    }

    @Test
    void testSecondQuadrant() {
        String input = "-4 6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        CoordinateQuadrants.main(new String[]{});
        assertEquals("2", outContent.toString().trim());
    }

    @Test
    void testThirdQuadrant() {
        String input = "-4 -6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        CoordinateQuadrants.main(new String[]{});
        assertEquals("3", outContent.toString().trim());
    }

    @Test
    void testFourthQuadrant() {
        String input = "4 -6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        CoordinateQuadrants.main(new String[]{});
        assertEquals("4", outContent.toString().trim());
    }
}

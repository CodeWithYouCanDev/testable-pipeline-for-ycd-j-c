package youcandev.mentoring.java_syntax._03_conditional_operator._09_triangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

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
    void testTriangleCanBeFormed() {
        String input = "3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Triangle.main(new String[]{});
        assertEquals(Triangle.TRIANGLE_EXISTS, outContent.toString().trim());
    }

    @Test
    void testTriangleCannotBeFormed() {
        String input = "1\n2\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Triangle.main(new String[]{});
        assertEquals(Triangle.TRIANGLE_NOT_EXISTS, outContent.toString().trim());
    }

    @Test
    void testTriangleWithSameSides() {
        String input = "5\n5\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Triangle.main(new String[]{});
        assertEquals(Triangle.TRIANGLE_EXISTS, outContent.toString().trim());
    }

    @Test
    void testTriangleWithZeroSide() {
        String input = "5\n5\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Triangle.main(new String[]{});
        assertEquals(Triangle.TRIANGLE_NOT_EXISTS, outContent.toString().trim());
    }
}

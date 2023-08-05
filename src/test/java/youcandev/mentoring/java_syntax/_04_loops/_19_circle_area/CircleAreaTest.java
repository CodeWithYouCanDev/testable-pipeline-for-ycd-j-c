package youcandev.mentoring.java_syntax._04_loops._19_circle_area;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleAreaTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private ByteArrayInputStream inputStreamMock;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testCircleAreaWithGivenRadius() {
        String input = "5\n"; // radius = 5
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        CircleArea.main(new String[]{});

        assertEquals("78\r\n", outputStreamCaptor.toString());
    }

    @Test
    void testCircleAreaWithDifferentRadius() {
        String input = "3\n"; // radius = 3
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        CircleArea.main(new String[]{});

        assertEquals("28\r\n", outputStreamCaptor.toString()); // 3.14 * 3 * 3 = 28.26, rounded down to 28
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}

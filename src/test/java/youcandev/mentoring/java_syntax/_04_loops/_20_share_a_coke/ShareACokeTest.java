package youcandev.mentoring.java_syntax._04_loops._20_share_a_coke;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShareACokeTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private ByteArrayInputStream inputStreamMock;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testShareACokeDivision() {
        String input = "3\n2\n"; // 3 cans, 2 people
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        ShareACoke.main(new String[]{});

        assertEquals("1.5\r\n", outputStreamCaptor.toString());
    }

    @Test
    void testShareACokeWithDifferentNumbers() {
        String input = "5\n3\n"; // 5 cans, 3 people
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        ShareACoke.main(new String[]{});

        assertEquals("1.6666666666666667\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}

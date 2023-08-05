package youcandev.mentoring.java_syntax._04_loops._22_half_empty_or_half_full;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class HalfEmptyOrHalfFullTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private ByteArrayInputStream inputStreamMock;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testOptimist() {
        String input = "true\n";
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        HalfEmptyOrHalfFull.main(new String[]{});

        assertEquals("1\r\n", outputStreamCaptor.toString());
    }

    @Test
    void testPessimist() {
        String input = "false\n";
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        HalfEmptyOrHalfFull.main(new String[]{});

        assertEquals("0\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}

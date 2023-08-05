package youcandev.mentoring.java_syntax._04_loops._18_divisible_numbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleNumbersTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private ByteArrayInputStream inputStreamMock;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testNumbersUntilDivisibleByTen() {
        String input = "5\n7\n9\n11\n50\n"; // sample input
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        DivisibleNumbers.main(new String[]{});

        assertEquals("5\r\n7\r\n9\r\n11\r\n50\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void testFirstNumberDivisibleByTen() {
        String input = "20\n";
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        DivisibleNumbers.main(new String[]{});

        assertEquals("20\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}

package youcandev.mentoring.java_syntax._04_loops._16_sum_of_even_numbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import youcandev.mentoring.java_syntax._04_loops._15_even_numbers.EvenNumbers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfTheEvenNumbersTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testEvenNumbersPrintedCorrectly() {
        EvenNumbers.main(new String[]{});

        String expectedOutput = "2\r\n4\r\n6\r\n8\r\n10\r\n12\r\n14\r\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}

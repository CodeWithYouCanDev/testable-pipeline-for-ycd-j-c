package youcandev.mentoring.java_syntax._03_conditional_operator._14_ternary_operator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TernaryOperatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testNumberLessThan5() {
        System.setIn(new ByteArrayInputStream("4\n".getBytes()));
        TernaryOperator.main(null);
        assertEquals("liczba jest mniejsza niż 5\r\n", outContent.toString());
    }

    @Test
    void testNumberGreaterThan5() {
        System.setIn(new ByteArrayInputStream("6\n".getBytes()));
        TernaryOperator.main(null);
        assertEquals("liczba jest większa niż 5\r\n", outContent.toString());
    }

    @Test
    void testNumberEquals5() {
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));
        TernaryOperator.main(null);
        assertEquals("liczba równa się 5\r\n", outContent.toString());
    }
}

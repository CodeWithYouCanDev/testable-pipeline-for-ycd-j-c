package youcandev.mentoring.java_syntax._03_conditional_operator._05_grocery_conveyor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroceryConveyorTest {

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
    void testAllNumbersPositive() {
        String input = "1\n2\n3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        GroceryConveyor.main(new String[]{});
        assertEquals("1\r\n2\r\n3\r\n4", outContent.toString().trim());
    }

    @Test
    void testSomeNumbersPositive() {
        String input = "-1\n2\n-3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        GroceryConveyor.main(new String[]{});
        assertEquals("2\r\n4", outContent.toString().trim());
    }

    @Test
    void testNoNumbersPositive() {
        String input = "-1\n-2\n-3\n-4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        GroceryConveyor.main(new String[]{});
        assertEquals("", outContent.toString().trim());
    }

    @Test
    void testZeroesAndNegatives() {
        String input = "0\n0\n-3\n-4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        GroceryConveyor.main(new String[]{});
        assertEquals("", outContent.toString().trim());
    }
}

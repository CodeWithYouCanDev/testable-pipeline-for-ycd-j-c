package youcandev.mentoring.java_syntax._07_functions._07_array_utility;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayUtilityTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    void testReverseAndPrintArray() {
        System.setOut(new PrintStream(outContent));

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ArrayUtility.printArray(array);
        ArrayUtility.reverseArray(array);
        ArrayUtility.printArray(array);

        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 0, \r\n0, 9, 8, 7, 6, 5, 4, 3, 2, 1, \r\n", outContent.toString());

        System.setOut(originalOut);
    }
}

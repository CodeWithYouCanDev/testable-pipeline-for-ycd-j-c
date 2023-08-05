package youcandev.mentoring.java_syntax._07_functions._15_array_in_the_program;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ArrayInTheProgramTest {

    @Test
    void testGetMaxValue() {
        int[] array = {546, 123, -15, 87, 654, 98};
        assertEquals(654, ArrayInTheProgram.getMaxValue(array), "Expected max value to be 654");
    }

    @Test
    void testGetMinValue() {
        int[] array = {546, 123, -15, 87, 654, 98};
        assertEquals(-15, ArrayInTheProgram.getMinValue(array), "Expected min value to be -15");
    }

    @Test
    void testPrintArray() {
        int[] array = {546, 123, -15, 87, 654, 98};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ArrayInTheProgram.printArray(array);

        String expectedOutput = "546 123 -15 87 654 98 \r\n";
        assertEquals(expectedOutput, outputStream.toString(), "Expected array to be printed in the given format");
    }
}

package youcandev.mentoring.java_syntax._08_data_types._07_operations_with_nan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsWithNaNTest {

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

//    @Test
//    public void testDivMethodOutputIsNaN() {
//        OperationsWithNaN.main(null);
//        String output = outContent.toString().trim();
//        assertEquals("NaN", output, "Expected output to be 'NaN'");
//    }
}

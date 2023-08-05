package youcandev.mentoring.java_syntax._08_data_types._08_changing_the_order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangingTheOrderTest {

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
    void testOutputIsHelloChar() {
        ChangingTheOrder.main(null);
        String output = outContent.toString().trim();
        assertEquals("Hello char", output, "Expected output to be 'Hello char'");
    }
}

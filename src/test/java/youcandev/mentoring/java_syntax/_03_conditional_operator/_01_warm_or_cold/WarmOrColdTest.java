package youcandev.mentoring.java_syntax._03_conditional_operator._01_warm_or_cold;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WarmOrColdTest {

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
    public void testTemperatureBelowZero() {
        String input = "-5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WarmOrCold.main(new String[]{});
        assertTrue(outContent.toString().trim().equals("na zewnątrz jest zimno"));
    }

    @Test
    public void testTemperatureAboveZero() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WarmOrCold.main(new String[]{});
        assertTrue(outContent.toString().trim().equals("na zewnątrz jest ciepło"));
    }

    @Test
    public void testTemperatureEqualsZero() {
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WarmOrCold.main(new String[]{});
        assertTrue(outContent.toString().trim().equals("na zewnątrz jest ciepło"));
    }
}

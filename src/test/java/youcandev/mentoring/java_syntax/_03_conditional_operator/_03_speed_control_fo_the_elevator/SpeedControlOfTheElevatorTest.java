package youcandev.mentoring.java_syntax._03_conditional_operator._03_speed_control_fo_the_elevator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedControlOfTheElevatorTest {

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
    public void testSpeedWithinRange() {
        String input = "2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SpeedControlOfTheElevator.main(new String[]{});
        assertEquals("Prędkość windy jest w normie", outContent.toString().trim());
    }

    @Test
    public void testSpeedEqualsThree() {
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SpeedControlOfTheElevator.main(new String[]{});
        assertEquals("Prędkość windy jest w normie", outContent.toString().trim());
    }

    @Test
    public void testSpeedBelowZero() {
        String input = "-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SpeedControlOfTheElevator.main(new String[]{});
        assertEquals("System error!", outContent.toString().trim());
    }

    @Test
    public void testSpeedAboveThree() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SpeedControlOfTheElevator.main(new String[]{});
        assertEquals("Prędkość windy jest zbyt wysoka, redukujemy...", outContent.toString().trim());
    }
}

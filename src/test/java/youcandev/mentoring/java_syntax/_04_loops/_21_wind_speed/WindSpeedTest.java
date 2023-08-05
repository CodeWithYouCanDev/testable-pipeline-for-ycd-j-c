package youcandev.mentoring.java_syntax._04_loops._21_wind_speed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WindSpeedTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private ByteArrayInputStream inputStreamMock;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testWindSpeedConversion() {
        String input = "1\n"; // 1 m/s
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        WindSpeed.main(new String[]{});

        assertEquals("4\r\n", outputStreamCaptor.toString()); // 1 m/s = 3.6 km/h -> rounded to 4
    }

    @Test
    void testWindSpeedConversionForDifferentSpeed() {
        String input = "3\n"; // 3 m/s
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        WindSpeed.main(new String[]{});

        assertEquals("11\r\n", outputStreamCaptor.toString()); // 3 m/s = 10.8 km/h -> rounded to 11
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}

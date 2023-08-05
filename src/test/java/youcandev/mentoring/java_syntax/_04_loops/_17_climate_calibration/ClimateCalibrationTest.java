package youcandev.mentoring.java_syntax._04_loops._17_climate_calibration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimateCalibrationTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private ByteArrayInputStream inputStreamMock;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAverageOfGivenNumbers() {
        String input = "10\n20\n30\n40\n50\n"; // sample input
        inputStreamMock = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStreamMock);

        ClimateCalibration.main(new String[]{});

        assertEquals("30\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}

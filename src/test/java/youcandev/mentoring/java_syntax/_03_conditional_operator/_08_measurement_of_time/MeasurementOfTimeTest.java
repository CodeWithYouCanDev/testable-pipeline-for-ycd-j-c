package youcandev.mentoring.java_syntax._03_conditional_operator._08_measurement_of_time;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementOfTimeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testExactlyHalfAnHour() {
        String input = "0\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MeasurementOfTime.main(new String[]{});
        assertEquals(MeasurementOfTime.halfAnHour, outContent.toString().trim());
    }

    @Test
    void testLessThanHalfAnHour() {
        String input = "0\n15\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MeasurementOfTime.main(new String[]{});
        assertEquals(MeasurementOfTime.lessThanHalfAnHour, outContent.toString().trim());
    }

    @Test
    void testMoreThanHalfAnHour() {
        String input = "0\n45\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MeasurementOfTime.main(new String[]{});
        assertEquals(MeasurementOfTime.moreThanHalfAnHour, outContent.toString().trim());
    }

    @Test
    void testMoreThanAnHour() {
        String input = "1\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MeasurementOfTime.main(new String[]{});
        assertEquals(MeasurementOfTime.moreThanHalfAnHour, outContent.toString().trim());
    }

    @Test
    void testSeveralHours() {
        String input = "5\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MeasurementOfTime.main(new String[]{});
        assertEquals(MeasurementOfTime.moreThanHalfAnHour, outContent.toString().trim());
    }

    @Test
    void testNoTimePassed() {
        String input = "0\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MeasurementOfTime.main(new String[]{});
        assertEquals(MeasurementOfTime.lessThanHalfAnHour, outContent.toString().trim());
    }
}

package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._16_acceleration_challenge;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class AccelerationChallengeTest {
    @Test
    void checkConcat() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AccelerationChallenge.main(new String[]{});

        String expectedOutput  = "Rozpędzamy się do 100500%" + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }
}

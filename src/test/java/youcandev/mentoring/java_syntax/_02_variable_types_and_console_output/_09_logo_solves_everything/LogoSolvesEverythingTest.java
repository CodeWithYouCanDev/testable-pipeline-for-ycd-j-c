package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._09_logo_solves_everything;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LogoSolvesEverythingTest {
    @Test
    public void checkTaglineValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        java_syntax._02_variable_types_and_console_output._09_logo_solves_everything.LogoSolvesEverything.main(new String[]{});

        String expectedOutput = "JustDoIt" + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }
}


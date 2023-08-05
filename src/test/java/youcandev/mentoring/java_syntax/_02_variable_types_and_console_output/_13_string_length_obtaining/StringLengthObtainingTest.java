package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._13_string_length_obtaining;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringLengthObtainingTest {
    @Test
    public void checkStringLengths() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        java_syntax._02_variable_types_and_console_output._13_string_length_obtaining.StringLengthObtaining.main(new String[]{});

        String expectedOutput  = "0" + System.lineSeparator();
        expectedOutput += "13" + System.lineSeparator();
        expectedOutput += "4" + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }

}

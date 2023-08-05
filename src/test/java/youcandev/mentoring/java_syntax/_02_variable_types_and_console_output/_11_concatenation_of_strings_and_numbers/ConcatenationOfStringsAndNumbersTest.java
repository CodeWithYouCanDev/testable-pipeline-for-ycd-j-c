package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._11_concatenation_of_strings_and_numbers;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConcatenationOfStringsAndNumbersTest {
    @Test
    void checkDigitsValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConcatenationOfStringsAndNumbers.main(new String[]{});

        String expectedOutput = "60" +System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }


}

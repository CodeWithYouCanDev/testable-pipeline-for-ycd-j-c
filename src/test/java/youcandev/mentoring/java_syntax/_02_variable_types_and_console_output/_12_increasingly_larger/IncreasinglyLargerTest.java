package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._12_increasingly_larger;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IncreasinglyLargerTest {

    @Test
    public void checkHugeAmountValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        java_syntax._02_variable_types_and_console_output._12_increasingly_larger.IncreasinglyLarger.main(new String[]{});

        String expectedOutput = "100500" + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }

}

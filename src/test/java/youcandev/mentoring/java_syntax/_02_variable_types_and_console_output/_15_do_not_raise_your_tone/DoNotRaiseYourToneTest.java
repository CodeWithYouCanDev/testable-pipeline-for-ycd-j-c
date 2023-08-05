package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._15_do_not_raise_your_tone;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DoNotRaiseYourToneTest {
    @Test
    public void checkUpperCase() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        java_syntax._02_variable_types_and_console_output._15_do_not_raise_your_tone.DoNotRaiseYourTone.main(new String[]{});

        String expectedOutput  = "USA" + System.lineSeparator();
        expectedOutput += "YOU CAN DEV" + System.lineSeparator();
        expectedOutput += "IF I TYPE IN CAPS THEY KNOW I MEAN BUSINESS" + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }
}

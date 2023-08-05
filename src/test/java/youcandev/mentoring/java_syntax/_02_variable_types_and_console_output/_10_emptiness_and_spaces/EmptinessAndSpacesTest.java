package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._10_emptiness_and_spaces;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EmptinessAndSpacesTest {
    @Test
    public void checkFullnessValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        java_syntax._02_variable_types_and_console_output._10_emptiness_and_spaces.EmptinessAndSpaces.main(new String[]{});

        String expectedOutput = "pustka pustka pustka" + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }

}

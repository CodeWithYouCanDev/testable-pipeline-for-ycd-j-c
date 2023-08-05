package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._14_preparing_our_cv;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PreparingOurCVTest {
    @Test
    public void checkLowerCase() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        java_syntax._02_variable_types_and_console_output._14_preparing_our_cv.PreparingOurCV.main(new String[]{});

        String expectedOutput  = "resume" + System.lineSeparator();
        expectedOutput += "title: senior lead principal software engineer data architect" + System.lineSeparator();
        expectedOutput += "degree: in college, i majored in political science and minored in religious studies." + System.lineSeparator();
        expectedOutput += "career: experienced team leader with strong organizational skills and a successful career in management." + System.lineSeparator();

        assertThat(outContent.toString()).isEqualTo(expectedOutput);
    }

}

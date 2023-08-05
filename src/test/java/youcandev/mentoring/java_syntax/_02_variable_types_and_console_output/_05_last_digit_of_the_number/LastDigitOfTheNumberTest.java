package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._05_last_digit_of_the_number;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LastDigitOfTheNumberTest {
    @Test
    public void checkLastDigitInitialization() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_05_last_digit_of_the_number/LastDigitOfTheNumber.java")));

        Pattern lastDigitPattern = Pattern.compile("int\\s+lastDigit\\s*=\\s*number\\s*%\\s*10\\s*;");
        Matcher lastDigitMatcher = lastDigitPattern.matcher(content);

        assertThat(lastDigitMatcher.find()).isTrue();
    }

}

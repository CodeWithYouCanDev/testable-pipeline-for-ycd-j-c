package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._07_32_teeth;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ThirtyTwoTeethTest {

    @Test
    public void checkDecrementOperations() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_07_32_teeth/ThirtyTwoTeeth.java")));

        Pattern decrementPattern = Pattern.compile("toothCounter--;");
        Matcher decrementMatcher = decrementPattern.matcher(content);

        int count = 0;
        while (decrementMatcher.find()) {
            count++;
        }

        assertThat(count).isEqualTo(9);
    }

}

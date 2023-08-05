package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._06_9_is_reversed_6;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NineIsReversedSixTest {

    @Test
    public void checkIncrementOperations() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_06_9_is_reversed_6/NineIsReversedSix.java")));

        Pattern incrementPattern = Pattern.compile("six\\+\\+;");
        Matcher incrementMatcher = incrementPattern.matcher(content);

        int count = 0;
        while (incrementMatcher.find()) {
            count++;
        }

        assertThat(count).isEqualTo(3);
    }

}

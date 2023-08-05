package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._04_full_length_picture;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FullLengthPictureTest {
    @Test
    public void checkMeterInitialization() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_04_full_length_picture/FullLengthPicture.java")));
            Pattern meterInitializationPattern = Pattern.compile("int\\s+meters\\s*=\\s*centimeters\\s*/\\s*100\\s*;");
            Matcher meterInitializationMatcher = meterInitializationPattern.matcher(content);
            assertThat(meterInitializationMatcher.find()).isTrue();
        }
}

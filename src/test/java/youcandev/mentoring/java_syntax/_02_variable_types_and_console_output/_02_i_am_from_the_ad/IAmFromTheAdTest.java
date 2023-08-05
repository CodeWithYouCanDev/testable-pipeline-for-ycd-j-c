package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._02_i_am_from_the_ad;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IAmFromTheAdTest {
    @Test
    void variablesAreDeclaredAndHaveDifferentValues() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax/_02_variable_types_and_console_output/_02_i_am_from_the_ad/IAmFromTheAd.java")));

        Pattern variablePattern = Pattern.compile(
                "int\\s+intValue\\s*=\\s*(\\d+);.*?" +    // For non-greedy matching
                        "int\\s+numericValue\\s*=\\s*(\\d+);.*?" +
                        "int\\s+size\\s*=\\s*(\\d+);.*?" +
                        "int\\s+number\\s*=\\s*(\\d+);",
                Pattern.DOTALL);    // For multiline matching

        Matcher variableMatcher = variablePattern.matcher(content);
        assertThat(variableMatcher.find()).isTrue();

        int intValue = Integer.parseInt(variableMatcher.group(1));
        int numericValue = Integer.parseInt(variableMatcher.group(2));
        int size = Integer.parseInt(variableMatcher.group(3));
        int number = Integer.parseInt(variableMatcher.group(4));

        assertThat(intValue).isNotEqualTo(numericValue);
        assertThat(intValue).isNotEqualTo(size);
        assertThat(intValue).isNotEqualTo(number);
        assertThat(numericValue).isNotEqualTo(size);
        assertThat(numericValue).isNotEqualTo(number);
        assertThat(size).isNotEqualTo(number);
    }
}

package youcandev.mentoring.java_syntax._01_commands_and_first_program._05_i_am_from_the_ad;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IAmFromTheAdTest {

    @Test
    public void variablesAreDeclaredAndHaveDifferentValues() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_01_commands_and_first_program/_05_i_am_from_the_ad/IAmFromTheAd.java")));

        Pattern aVariablePattern = Pattern.compile("int\\s+a\\s*=\\s*(\\d+)\\s*;");
        Matcher aVariableMatcher = aVariablePattern.matcher(content);
        assertThat(aVariableMatcher.find()).isTrue();
        int aValue = Integer.parseInt(aVariableMatcher.group(1));

        Pattern bVariablePattern = Pattern.compile("int\\s+b\\s*=\\s*(\\d+)\\s*;");
        Matcher bVariableMatcher = bVariablePattern.matcher(content);
        assertThat(bVariableMatcher.find()).isTrue();
        int bValue = Integer.parseInt(bVariableMatcher.group(1));

        assertThat(aValue).isNotEqualTo(bValue);
    }

}

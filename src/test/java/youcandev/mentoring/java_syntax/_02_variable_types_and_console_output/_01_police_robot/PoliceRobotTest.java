package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._01_police_robot;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PoliceRobotTest {
    @Test
    public void variablesAreDeclaredAndHaveDifferentValues() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_01_police_robot/PoliceRobot.java")));

        Pattern idVariablePattern = Pattern.compile("int\\s+id\\s*=\\s*(\\d+)\\s*;");
        Matcher idVariableMatcher = idVariablePattern.matcher(content);
        assertThat(idVariableMatcher.find()).isTrue();
        int idValue = Integer.parseInt(idVariableMatcher.group(1));

        Pattern ageVariablePattern = Pattern.compile("int\\s+age\\s*=\\s*(\\d+)\\s*;");
        Matcher ageVariableMatcher = ageVariablePattern.matcher(content);
        assertThat(ageVariableMatcher.find()).isTrue();
        int ageValue = Integer.parseInt(ageVariableMatcher.group(1));

        Pattern documentsVariablePattern = Pattern.compile("String\\s+documents\\s*=\\s*\"([^\"]*)\"\\s*;");
        Matcher documentsVariableMatcher = documentsVariablePattern.matcher(content);
        assertThat(documentsVariableMatcher.find()).isTrue();
        String documentsValue = documentsVariableMatcher.group(1);

        Pattern behaviorVariablePattern = Pattern.compile("String\\s+behavior\\s*=\\s*\"([^\"]*)\"\\s*;");
        Matcher behaviorVariableMatcher = behaviorVariablePattern.matcher(content);
        assertThat(behaviorVariableMatcher.find()).isTrue();
        String behaviorValue = behaviorVariableMatcher.group(1);

        assertThat(idValue).isNotEqualTo(ageValue);
        assertThat(documentsValue).isNotEqualTo(behaviorValue);
    }
}

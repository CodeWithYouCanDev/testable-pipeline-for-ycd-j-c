package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._08_generation_inspirational_stories;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GenerationInspirationalStoriesTest {
    @Test
    public void checkVariableDeclarations() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_08_generation_inspirational_stories/GenerationInspirationalStories.java")));

        String[] variableNames = {"name", "date", "event", "object", "adjective", "action"};

        for (String variableName : variableNames) {
            Pattern variablePattern = Pattern.compile(String.format("String %s = \".+\";", variableName));
            Matcher variableMatcher = variablePattern.matcher(content);

            assertThat(variableMatcher.find()).isTrue();
        }
    }


}

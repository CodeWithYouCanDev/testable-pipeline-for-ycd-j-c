package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._17_sum_of_three_numbers;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumOfThreeNumbersTest {

    @Test
    void testSum() throws Exception {
        String code = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_17_sum_of_three_numbers/SumOfThreeNumbers.java")));

        assertThat(code).contains("number1 + number2 + number3");
    }

}

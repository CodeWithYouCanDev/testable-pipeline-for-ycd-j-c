package youcandev.mentoring.java_syntax._01_commands_and_first_program._08_unnecessary_comments;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnnecessaryCommentsTest {
    @Test
    void shouldPrintDesiredText() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        UnnecessaryComments.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "12\r\n2";
        //then
        assertEquals(printedText, expectedText);
    }
}

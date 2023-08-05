package youcandev.mentoring.java_syntax._01_commands_and_first_program._01_first_program;




import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FirstProgramTest {

    @Test
    void shouldReturnDesiredTextFromSystemOutPrintln() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        FirstProgram.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "My first program works!";

        //then
        assertEquals(expectedText, printedText, "Text printed on the console should be exact -> My first program works! and " +
                "your main function printed this : " + printedText);
    }

    @Test
    void shouldStartFromMy() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        FirstProgram.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "My";

        //then
        assertTrue(printedText.startsWith(expectedText), "Text printed on the console should start with My phrase" +
                                " and string printed on the console produced by your function is " + printedText);

    }

    @Test
    void shouldEndWithWorks() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        FirstProgram.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "works!";

        //then
        assertTrue(printedText.endsWith(expectedText), "Text printed on the console should end with works! phrase" +
                                " and string printed on the console produced by your function is " + printedText);
    }

    @Test
    void shouldHas23Length() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        FirstProgram.main(new String[]{});
        String printedText = outputStream.toString().trim();
        int expectedLength = 23;

        //then
        assertEquals(printedText.length(), expectedLength, "Text printed on the console should be exact 23 length"
        + printedText.length());
    }
}

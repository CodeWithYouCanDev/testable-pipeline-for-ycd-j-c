package youcandev.mentoring.java_syntax._01_commands_and_first_program._04_unnecessary_lines_of_code;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IamProgrammerTest {
    @Test
    void shouldPrintDesiredStringInTwoLines() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        IamProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "Jestem programistą!\r\nPiszę kod w Javie!";

        //then
        assertEquals(expectedText, printedText);
    }

    @Test
    void shouldStartWithMysle() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        IamProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "Jestem programistą!";

        //then
        assertTrue(printedText.startsWith(expectedText));
    }

    @Test
    void shouldEndWithPoprawnie() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        IamProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "Piszę kod w Javie!";

        //then
        assertTrue(printedText.endsWith(expectedText));
    }

    @Test
    void shouldContainsTwoRows() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        IamProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();

        //then
        assertTrue(printedText.contains("\r\n"));
        assertFalse(printedText.contains("\r\n\r\n"));
    }
}

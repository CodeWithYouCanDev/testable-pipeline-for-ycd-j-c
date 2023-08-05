package youcandev.mentoring.java_syntax._01_commands_and_first_program._03_being_programmer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BeingProgrammerTest {

    @Test
    void shouldPrintDesiredStringInTwoLines() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        BeingProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "Myślę, że być programistą jest fajnie\r\nMój pierwszy program działa poprawnie";

        //then
        assertEquals(expectedText, printedText);
    }

    @Test
    void shouldStartWithMysle() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        BeingProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "Myślę";

        //then
        assertTrue(printedText.startsWith(expectedText));
    }

    @Test
    void shouldEndWithPoprawnie() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        BeingProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "poprawnie";

        //then
        assertTrue(printedText.endsWith(expectedText));
    }

    @Test
    void shouldContainsTwoRows() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        BeingProgrammer.main(new String[]{});
        String printedText = outputStream.toString().trim();

        //then
        assertTrue(printedText.contains("\r\n"));
        assertFalse(printedText.contains("\r\n\r\n"));
    }
}

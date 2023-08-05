package youcandev.mentoring.java_syntax._01_commands_and_first_program._09_two_plus_three;

import org.junit.jupiter.api.Test;
import youcandev.mentoring.java_syntax._01_commands_and_first_program._04_unnecessary_lines_of_code.IamProgrammer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPlusThreeTest {
    @Test
    void shouldPrintDesiredText() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        TwoPlusThree.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "2 plus 3 równa się 5";

        //then
        assertEquals(expectedText, printedText);
    }
}

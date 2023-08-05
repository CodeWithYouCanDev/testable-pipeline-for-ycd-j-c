package youcandev.mentoring.java_syntax._01_commands_and_first_program._07_antivirus;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AntivirusTest {
    @Test
    void shouldPrintDesiredText() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        Antivirus.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "Integrujemy narzędzia antywirusowe - PoliRush Monitor, PoliRush Guard, " +
                "PoliRush Security do systemu, skanujemy sieć, usuwamy wirusy i błędy.";
        //then
        assertEquals(printedText, expectedText);
    }

}

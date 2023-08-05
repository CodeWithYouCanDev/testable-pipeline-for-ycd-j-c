package youcandev.mentoring.java_syntax._07_functions._04_magic_vs_witch;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagicVsWitchTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMain() {
        MagicVsWitch.main(new String[]{});
        String expectedOutput = "Z za zakątków lasu wyłoniła się czarownica..."
                + System.lineSeparator() + "Różdżka ustawiona na tryb z magią";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testSetWandMode() {
        MagicVsWitch.setWandMode(MagicVsWitch.withoutMagic);
        String expectedOutput = "Różdżka ustawiona na tryb bez magii";
        assertEquals(expectedOutput, outContent.toString().trim());

        outContent.reset();  // Clearing the previous output

        MagicVsWitch.setWandMode(MagicVsWitch.withMagic);
        expectedOutput = "Różdżka ustawiona na tryb z magią";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}

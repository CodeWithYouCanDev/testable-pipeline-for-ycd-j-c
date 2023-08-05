package youcandev.mentoring.java_syntax._07_functions._06_archaeological_expedition_team;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArchaeologicalExpeditionTeamTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMain() {
        ArchaeologicalExpeditionTeam.main(new String[]{});
        String expectedOutput = "Zespół gotowy do rozpoczęcia wyprawy archeologicznej:"
                + System.lineSeparator() + "Archeolog: Anna"
                + System.lineSeparator() + "Historyk: Bartek"
                + System.lineSeparator() + "Geolog: Jakub"
                + System.lineSeparator() + "Biolog: Dorota";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testCreateTeam() {
        ArchaeologicalExpeditionTeam.createTeam("Ewa", "Piotr", "Lukasz", "Magda");
        String expectedOutput = "Zespół gotowy do rozpoczęcia wyprawy archeologicznej:"
                + System.lineSeparator() + "Archeolog: Ewa"
                + System.lineSeparator() + "Historyk: Piotr"
                + System.lineSeparator() + "Geolog: Lukasz"
                + System.lineSeparator() + "Biolog: Magda";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}

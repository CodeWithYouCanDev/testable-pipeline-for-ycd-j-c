package youcandev.mentoring.java_syntax._07_functions._13_luke_battle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DarkKnightTest {

    @BeforeEach
    public void setUp() {
        // Reset the DarkKnight's status before each test
        DarkKnight.setIsDefeated(true);
    }

    @Test
    void testIsDefeatedIsSetCorrectly() {
        DarkKnight.setIsDefeated(false);
        assertFalse(DarkKnight.isDefeated, "Expected DarkKnight not to be defeated");
    }

    @Test
    void testDisplayStatusIsDefeated() {
        // Capture the console output
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DarkKnight.displayStatus();
        assertEquals("Luke NIE pokonał Ciemnego Rycerza\r\n", outContent.toString());
    }

    @Test
    void testDisplayStatusNotDefeated() {
        // Capture the console output
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DarkKnight.setIsDefeated(false);
        DarkKnight.displayStatus();
        assertEquals("Luke pokonał Ciemnego Rycerza\r\n", outContent.toString());
    }
}

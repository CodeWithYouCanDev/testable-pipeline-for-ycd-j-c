package youcandev.mentoring.java_syntax._07_functions._16_wolf_attack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WolfAttackTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testWolfAttackMain() {
        WolfAttack.main(new String[]{});  // invoking the main method

        String[] outputLines = outputStream.toString().split("\r\n");

        assertEquals("Wataha wilków zaatakowała kemping.", outputLines[0]);
        assertEquals("Ludzie znalazli drogę do bezpieczeństwa.", outputLines[1]);
    }

    @Test
    void testChangeWolves() {
        WolfAttack.changeWolves();

        assertEquals("śpiące koty", WolfAttack.wolves, "Expected wolves to change to 'śpiące koty'");
    }
}

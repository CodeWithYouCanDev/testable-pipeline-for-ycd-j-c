package youcandev.mentoring.java_syntax._03_conditional_operator._16_confectioner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConfectionerTest {

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
    void testAllIngredientsPresent() {
        Confectioner.main(null);
        String expectedOutput = "Dodajemy cukier\r\nDodajemy mleko\r\nDodajemy mąke\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

package youcandev.mentoring.java_syntax._07_functions._05_change_colors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChangeColorsTest {
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
        ChangeColors.main(new String[]{});
        String expectedOutput = "Dane samochodu:"
                + System.lineSeparator() + "Kolor: Czerwony"
                + System.lineSeparator() + "Marka: Toyota"
                + System.lineSeparator() + "Rok produkcji: 2020";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testDisplayCarInfo() {
        ChangeColors.displayCarInfo("Niebieski", "BMW", 2023);
        String expectedOutput = "Dane samochodu:"
                + System.lineSeparator() + "Kolor: Niebieski"
                + System.lineSeparator() + "Marka: BMW"
                + System.lineSeparator() + "Rok produkcji: 2023";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}

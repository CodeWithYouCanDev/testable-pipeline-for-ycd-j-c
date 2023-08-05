package youcandev.mentoring.java_syntax._06_arrays._21_tanks_destruction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TanksDestructionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testWidthHeightInitialization() {
        assertEquals(30, TanksDestruction.width, "Width is not initialized correctly.");
        assertEquals(10, TanksDestruction.height, "Height is not initialized correctly.");
    }

    @Test
    void testFieldInitialization() {
        assertNotNull(TanksDestruction.field, "Field is not initialized.");
        assertEquals(10, TanksDestruction.field.length, "Field height is incorrect.");
        for (int i = 0; i < TanksDestruction.field.length; i++) {
            assertEquals(30, TanksDestruction.field[i].length, "Field width is incorrect.");
        }
    }

    @Test
    void testPrintedFieldWidth() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TanksDestruction.main(null);
        String[] lines = outContent.toString().split("\n");

        int expectedWidth = TanksDestruction.width;
        // Checking the width of the first line only, assuming all lines are of the same width
        int actualWidth = lines[0].length() - 1; // Subtract 1 to account for the end-of-line character

        assertEquals(expectedWidth, actualWidth, "Printed field width is incorrect.");
    }
}

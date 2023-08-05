package youcandev.mentoring.java_syntax._06_arrays._22_tanks_destruction_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TanksDestruction2Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testNumberOfTanks() {
        TanksDestruction2.main(null);

        int tankCount = 0;
        for (int i = 0; i < TanksDestruction2.height; i++) {
            for (int j = 0; j < TanksDestruction2.width; j++) {
                if (TanksDestruction2.field[i][j].equals(TanksDestruction2.tank)) {
                    tankCount++;
                }
            }
        }

        assertEquals(10, tankCount, "There should be exactly 10 tanks on the field.");
    }

    @Test
    void testSingleTankPerRow() {
        TanksDestruction2.main(null);

        for (int i = 0; i < TanksDestruction2.height; i++) {
            int tanksInRow = 0;
            for (int j = 0; j < TanksDestruction2.width; j++) {
                if (TanksDestruction2.field[i][j].equals(TanksDestruction2.tank)) {
                    tanksInRow++;
                }
            }
            assertEquals(1, tanksInRow, "Each row should contain only one tank.");
        }
    }

    @Test
    void testPrintedField() {
        TanksDestruction2.main(null);

        // Split the output based on the tank or empty symbols.
        String[] items = outContent.toString().split(", ");
        int rowCount = (int) items.length / TanksDestruction2.width;

        assertEquals(TanksDestruction2.height, rowCount, "Printed field height is incorrect.");
    }

}

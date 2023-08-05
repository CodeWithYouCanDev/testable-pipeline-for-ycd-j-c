package youcandev.mentoring.java_syntax._06_arrays._23_tanks_desturction_3;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TanksDestruction3Test {

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
    void testBombsArrayDimensions() {
        TanksDestruction3.main(null);

        // Check bombs array dimensions
        assertEquals(TanksDestruction3.height, TanksDestruction3.bombs.length, "Bombs array height is incorrect.");
        for (int[] row : TanksDestruction3.bombs) {
            assertEquals(TanksDestruction3.width, row.length, "Bombs array width is incorrect in one or more rows.");
        }
    }

    @Test
    void testBombsArrayContent() {
        TanksDestruction3.main(null);

        // Check that there are exactly 10 bombs in each row
        for (int[] row : TanksDestruction3.bombs) {
            int bombsCount = (int) Arrays.stream(row).filter(value -> value == 1).count();
            assertEquals(10, bombsCount, "Number of bombs in one or more rows is not 10.");
        }
    }
}

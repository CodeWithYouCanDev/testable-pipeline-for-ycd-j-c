package youcandev.mentoring.java_syntax._06_arrays._24_tanks_destruction_4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TanksDestruction4Test {

    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(bos));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testTanksPlaced() {
        TanksDestruction4.main(new String[]{});
        long tankCount = Arrays.stream(TanksDestruction4.field)
                .flatMap(Arrays::stream)
                .filter(cell -> cell.equals(TanksDestruction4.tank))
                .count();
        assertTrue(tankCount > 0);  // At least one tank should be placed.
    }

    @Test
    void testBombsPlaced() {
        TanksDestruction4.main(new String[]{});
        long bombsCount = Arrays.stream(TanksDestruction4.bombs)
                .flatMapToInt(Arrays::stream)
                .filter(bomb -> bomb == 1)
                .count();
        assertTrue(bombsCount > 0);  // At least one bomb should be placed.
    }

    @Test
    void testTankHitByBomb() {
        TanksDestruction4.main(new String[]{});
        for (int i = 0; i < TanksDestruction4.height; i++) {
            for (int j = 0; j < TanksDestruction4.width; j++) {
                if (TanksDestruction4.bombs[i][j] == 1) {
                    assertFalse(TanksDestruction4.field[i][j].equals(TanksDestruction4.tank),
                            "Tank should not be present if a bomb hits it.");
                }
            }
        }
    }
}

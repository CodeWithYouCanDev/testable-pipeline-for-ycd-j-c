package youcandev.mentoring.java_syntax._06_arrays._25_tanks_destruction_5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TanksDestruction5Test {

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
    void testAllTanksAreDestroyed() {
        TanksDestruction5.main(new String[]{});

        // Assert that the printed output contains the hit symbol
        assertTrue(bos.toString().contains(TanksDestruction5.hit));

        // Assert that the printed output does NOT contain any alive tanks
        assertFalse(bos.toString().contains(TanksDestruction5.tank));
    }

    @Test
    void testBombsReshuffledAfterEachRun() {
        TanksDestruction5.main(new String[]{});
        int[][] firstRunBombs = deepCopyOf(TanksDestruction5.bombs);

        TanksDestruction5.main(new String[]{});
        int[][] secondRunBombs = deepCopyOf(TanksDestruction5.bombs);

        // This assertion checks if the bombs' positions change between two consecutive runs.
        assertFalse(Arrays.deepEquals(firstRunBombs, secondRunBombs));
    }

    private int[][] deepCopyOf(int[][] original) {
        if (original == null) {
            return null;
        }

        final int[][] result = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

}

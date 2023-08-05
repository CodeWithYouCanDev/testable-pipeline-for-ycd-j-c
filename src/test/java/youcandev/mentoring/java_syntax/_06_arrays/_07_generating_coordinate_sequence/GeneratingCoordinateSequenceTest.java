package youcandev.mentoring.java_syntax._06_arrays._07_generating_coordinate_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratingCoordinateSequenceTest {

    @Test
    void testGeneratingCoordinateSequence() {
        // Act
        GeneratingCoordinateSequence.main(new String[]{});

        // Assert
        // 1. Check the length of the coordinates array
        assertEquals(200, GeneratingCoordinateSequence.coordinates.length);

        // 2. Check the sequence of the coordinates array
        for (int i = 0; i < 100; i++) {
            assertEquals(i * 10, GeneratingCoordinateSequence.coordinates[i * 2]);
            assertEquals(i * 10 + 1, GeneratingCoordinateSequence.coordinates[i * 2 + 1]);
        }
    }
}

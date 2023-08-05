package youcandev.mentoring.java_syntax._07_functions._19_mysterious_stone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MysteriousStoneTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testGetRandomNumber() {
        int range = 4;
        int result = MysteriousStone.getRandomNumber(range);
        assertTrue(result >= 1 && result <= range);
    }

    // Given the constraints of the design, this test demonstrates how you can mock input
    // but is still not exhaustive or entirely predictable due to the random nature of the stone position.
    @Test
    void testFindStone() {
        // Mocking input for the stone's position. Assuming the stone's position is 2 (for this mock only).
        String simulatedUserInput = "1\n3\n2\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        MysteriousStone.stonePosition = 2; // For the sake of this test
        MysteriousStone.findStone();

        String[] outputLines = outContent.toString().split("\r\n");
        assertEquals(MysteriousStone.getFirstPositionPhrase, outputLines[0]);
        assertEquals(MysteriousStone.getPositionPhrase, outputLines[1]);
        assertEquals(MysteriousStone.getPositionPhrase, outputLines[2]);
        assertEquals(MysteriousStone.findStonePhrase, outputLines[3]);
    }
}

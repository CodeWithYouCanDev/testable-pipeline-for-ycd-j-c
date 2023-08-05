package youcandev.mentoring.java_syntax._08_data_types._12_activating_the_colling_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ActivatingTheCollingSystemTest {

    // Mock System.out to capture console outputs
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void increaseTemperatureTest() {
        int initialTemperature = 85;
        ActivatingTheCollingSystem.increaseTemperature(initialTemperature);
        String expectedOutput = "Temperatura wewnątrz metody increaseTemperature(int) wynosi 90\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void coolDownTest() {
        int[] temperatures = {80, 85, 90, 95, 100};
        int[] expectedTemperatures = {75, 80, 85, 90, 95};
        ActivatingTheCollingSystem.coolDown(temperatures);

        // Check if the temperatures in the array were decreased correctly
        assertArrayEquals(expectedTemperatures, temperatures);

        // Check the output message
        String expectedOutput = "Temperatury wszystkich elementów tablicy wewnątrz metody coolDown(int[]) to [75, 80, 85, 90, 95]\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

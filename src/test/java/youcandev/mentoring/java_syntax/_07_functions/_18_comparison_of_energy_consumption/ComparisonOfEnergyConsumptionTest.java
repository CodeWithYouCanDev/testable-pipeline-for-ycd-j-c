package youcandev.mentoring.java_syntax._07_functions._18_comparison_of_energy_consumption;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ComparisonOfEnergyConsumptionTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintEnergyConsumption() {
        ComparisonOfEnergyConsumption.printEnergyConsumption("Chiny", 75.5);
        ComparisonOfEnergyConsumption.printEnergyConsumption("Indie", 65.3);
        ComparisonOfEnergyConsumption.printEnergyConsumption("Rosja", 55.2);
        ComparisonOfEnergyConsumption.printEnergyConsumption("Niemcy", 45.6);

        String lineSeparator = System.lineSeparator();
        String expectedOutput =
                "Zużycie energii w Chiny wynosi 75.5 TWh." + lineSeparator +
                        "Podczas gdy w kraju o największym zużyciu energii, USA, zużycie wynosi 105.3 TWh." + lineSeparator +
                        "Zużycie energii w Indie wynosi 65.3 TWh." + lineSeparator +
                        "Podczas gdy w kraju o największym zużyciu energii, USA, zużycie wynosi 105.3 TWh." + lineSeparator +
                        "Zużycie energii w Rosja wynosi 55.2 TWh." + lineSeparator +
                        "Podczas gdy w kraju o największym zużyciu energii, USA, zużycie wynosi 105.3 TWh." + lineSeparator +
                        "Zużycie energii w Niemcy wynosi 45.6 TWh." + lineSeparator +
                        "Podczas gdy w kraju o największym zużyciu energii, USA, zużycie wynosi 105.3 TWh." + lineSeparator;

        assertEquals(expectedOutput, outputStream.toString());
    }

}

package youcandev.mentoring.java_syntax._07_functions._02_separating_information;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SeparatingInformationTest {
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
    void testPrintCoffeeInfo() {
        SeparatingInformation.printCoffeeInfo();
        String expected = "Kawa to jeden z najpopularniejszych napojów na świecie, wytwarzany z palonych ziaren kawowca. "
                + System.lineSeparator() + "Początki jej spożycia sięgają Etiopii, skąd przeszła do świata arabskiego, a następnie rozprzestrzeniła się globalnie."
                + System.lineSeparator() + "Oprócz pobudzających właściwości kofeiny, "
                + System.lineSeparator() + "kawa jest także źródłem przeciwutleniaczy. "
                + System.lineSeparator() + "Dla wielu stała się nieodłącznym rytuałem poranka";
        assertTrue(outContent.toString().trim().equals(expected));
    }

    @Test
    void testPrintJavaInfo() {
        SeparatingInformation.printJavaInfo();
        String expected = "Java jest językiem programowania, który został stworzony w latach 90. przez firmę Sun Microsystems."
                + System.lineSeparator() + "Jego uniwersalność oraz platformowa niezależność („Write Once, Run Anywhere”) przyczyniła się do tego,"
                + System.lineSeparator() + "że stał się jednym z najpopularniejszych języków programowania na świecie."
                + System.lineSeparator() + "Jego logo, "
                + System.lineSeparator() + "w postaci kubka kawy, odzwierciedla jego nazwę - "
                + System.lineSeparator() + "Java to również odmiana kawy.";
        assertTrue(outContent.toString().trim().equals(expected));
    }

    @Test
    void testMain() {
        SeparatingInformation.main(new String[]{});
        String expected = "Java jest językiem programowania, który został stworzony w latach 90. przez firmę Sun Microsystems."
                + System.lineSeparator() + "Jego uniwersalność oraz platformowa niezależność („Write Once, Run Anywhere”) przyczyniła się do tego,"
                + System.lineSeparator() + "że stał się jednym z najpopularniejszych języków programowania na świecie."
                + System.lineSeparator() + "Jego logo, "
                + System.lineSeparator() + "w postaci kubka kawy, odzwierciedla jego nazwę - "
                + System.lineSeparator() + "Java to również odmiana kawy."
                + System.lineSeparator() + "Kawa to jeden z najpopularniejszych napojów na świecie, wytwarzany z palonych ziaren kawowca. "
                + System.lineSeparator() + "Początki jej spożycia sięgają Etiopii, skąd przeszła do świata arabskiego, a następnie rozprzestrzeniła się globalnie."
                + System.lineSeparator() + "Oprócz pobudzających właściwości kofeiny, "
                + System.lineSeparator() + "kawa jest także źródłem przeciwutleniaczy. "
                + System.lineSeparator() + "Dla wielu stała się nieodłącznym rytuałem poranka";
        assertTrue(outContent.toString().trim().equals(expected));
    }
}

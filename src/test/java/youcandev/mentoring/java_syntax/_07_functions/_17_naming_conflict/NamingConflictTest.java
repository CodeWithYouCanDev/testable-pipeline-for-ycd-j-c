package youcandev.mentoring.java_syntax._07_functions._17_naming_conflict;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class NamingConflictTest {

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
    void testPrintSqrt() {
        int[] testArray = {4, 9, 16, 25};

        NamingConflict.printSqrt(testArray);  // invoking the method

        String[] outputLines = outputStream.toString().split("\r\n");

        assertEquals("Pierwiastek kwadratowy z liczby 4 wynosi 2.0", outputLines[0]);
        assertEquals("Pierwiastek kwadratowy z liczby 9 wynosi 3.0", outputLines[1]);
        assertEquals("Pierwiastek kwadratowy z liczby 16 wynosi 4.0", outputLines[2]);
        assertEquals("Pierwiastek kwadratowy z liczby 25 wynosi 5.0", outputLines[3]);
    }
}

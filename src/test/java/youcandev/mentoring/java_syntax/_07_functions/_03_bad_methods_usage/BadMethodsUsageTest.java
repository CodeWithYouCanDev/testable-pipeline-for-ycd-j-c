package youcandev.mentoring.java_syntax._07_functions._03_bad_methods_usage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BadMethodsUsageTest {
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
    void testMain() {
        BadMethodsUsage.main(new String[]{});
        String expectedOutput = "Java jest językiem programowania, który został stworzony w latach 90. przez firmę Sun Microsystems."
                + System.lineSeparator() + "Jego uniwersalność oraz platformowa niezależność („Write Once, Run Anywhere”) przyczyniła się do tego,";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testOnlyMainMethodExists() {
        Class<BadMethodsUsage> clazz = BadMethodsUsage.class;
        assertEquals(1, clazz.getDeclaredMethods().length, "There should only be one method in the class");
        assertTrue(clazz.getDeclaredMethods()[0].getName().equals("main"), "Only main method should exist in the class");
    }
}

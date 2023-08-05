package youcandev.mentoring.java_syntax._06_arrays._12_quick_array_filling;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickArrayFillingTest {

    @Test
    void testQuickArrayFilling() {
        // Setting up a stream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method to execute the code
        QuickArrayFilling.main(new String[]{});

        // Check the output
        String output = outputStream.toString().trim(); // Get the complete printed output
        assertEquals("Zadanie zostało wykonane poprawnie", output);

        // Also, check if the array contains "Java" (though this is a bit redundant given the code, but for completeness)
        assertTrue(containsJava(QuickArrayFilling.array));
    }

    private boolean containsJava(String[] array) {
        for (String s : array) {
            if ("Java".equals(s)) {
                return true;
            }
        }
        return false;
    }
}

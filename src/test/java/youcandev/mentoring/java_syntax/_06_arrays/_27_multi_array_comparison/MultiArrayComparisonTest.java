package youcandev.mentoring.java_syntax._06_arrays._27_multi_array_comparison;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MultiArrayComparisonTest {
    @Test
    void shouldPrintTrueWhenArraysAreEqual() {
        // Backup original System.out stream
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // Execute
        MultiArrayComparison.main(new String[]{});

        // Restore System.out stream
        System.setOut(originalOut);

        String output = bos.toString().trim(); // Remove trailing newline
        assertEquals("true", output);
    }
}
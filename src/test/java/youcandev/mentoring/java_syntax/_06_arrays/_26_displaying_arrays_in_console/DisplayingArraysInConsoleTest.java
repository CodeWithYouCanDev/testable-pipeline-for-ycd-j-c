package youcandev.mentoring.java_syntax._06_arrays._26_displaying_arrays_in_console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingArraysInConsoleTest {

    @Test
    void mainShouldPrintArraysCorrectly() {
        // Backup original System.out stream
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // Execute
        DisplayingArraysInConsole.main(new String[]{});

        // Restore System.out stream
        System.setOut(originalOut);

        String output = bos.toString().trim(); // Remove trailing newline
        String expectedOutput = "[[🙂, 🙂, 🙂, 🙂], [🙃, 🙃, 🙃, 🙃], [😋, 😋, 😋, 😋], [😎, 😎, 😎, 😎]]\r\n" +
                "[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]";

        assertEquals(expectedOutput, output);
    }

}

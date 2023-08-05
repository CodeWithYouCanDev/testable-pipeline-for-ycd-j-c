package youcandev.mentoring.java_syntax._04_loops._14_system_error;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SystemErrorTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(bos));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testInputLessThanOrEqualToZero() {
        String input = "-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SystemError.main(new String[]{});
        assertTrue(bos.toString().contains("Błąd. Wprowadzona liczba musi byc większa od 0."));
    }

    @Test
    void testRandomGeneration() {
        // This test will run several times since it's probabilistic.
        // We're checking that the logic of generating random numbers and matching them works,
        // but there's no guaranteed way to predict the exact number of attempts.
        for (int i = 0; i < 10; i++) {
            bos.reset();
            String input = "10\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SystemError.main(new String[]{});

            String outputStr = bos.toString().trim();
            String[] parts = outputStr.split(" ");

            // It should be "Próba №" followed by a number
            if (parts.length != 2 || !parts[0].equals("Próba")) {
                fail("Unexpected output: " + outputStr);
            }

            // Removing the '№' and trying to parse the number
            int attempts = Integer.parseInt(parts[1].replace("№", "").trim());
            assertTrue(attempts > 0);
        }
    }

}

package youcandev.mentoring.java_syntax._03_conditional_operator._19_production_failure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ProductionFailureTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void testSuccessfulLoginUpperCase() {
        provideInput("QWERTY\n");
        ProductionFailure.main(new String[]{});
        assertTrue(outContent.toString().contains("Zalogowano!"));
    }

    @Test
    void testSuccessfulLoginLowerCase() {
        provideInput("qwerty\n");
        ProductionFailure.main(new String[]{});
        assertTrue(outContent.toString().contains("Zalogowano!"));
    }

    @Test
    void testFailedLogin() {
        provideInput("IncorrectPassword\n");
        ProductionFailure.main(new String[]{});
        assertTrue(outContent.toString().contains("Hasło jest niepoprawne!"));
    }
}

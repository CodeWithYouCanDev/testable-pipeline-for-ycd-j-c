package youcandev.mentoring.java_syntax._03_conditional_operator._20_broken_keyboard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BrokenKeyboardTest {
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
    void testCorrectPasswordMixedCase() {
        provideInput("AdMIn\n");
        BrokenKeyboard.main(new String[]{});
        assertTrue(outContent.toString().contains("dostęp przyznany"));
    }

    @Test
    void testCorrectPasswordAllLowerCase() {
        provideInput("admin\n");
        BrokenKeyboard.main(new String[]{});
        assertTrue(outContent.toString().contains("dostęp zabroniony"));
    }

    @Test
    void testIncorrectPassword() {
        provideInput("WrongPassword\n");
        BrokenKeyboard.main(new String[]{});
        assertTrue(outContent.toString().contains("dostęp zabroniony"));
    }
}

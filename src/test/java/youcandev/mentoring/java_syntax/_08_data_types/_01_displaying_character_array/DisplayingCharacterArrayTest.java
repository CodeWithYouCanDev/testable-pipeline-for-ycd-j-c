package youcandev.mentoring.java_syntax._08_data_types._01_displaying_character_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisplayingCharacterArrayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testDisplayingCharacterArrayOutput() {
        DisplayingCharacterArray.main(null);  // Call the main method

        // Construct the expected reversed output
        StringBuilder reversedChars = new StringBuilder();
        for (int i = DisplayingCharacterArray.chars.length - 1; i >= 0; i--) {
            reversedChars.append(DisplayingCharacterArray.chars[i]);
        }

        assertEquals(reversedChars.toString(), outContent.toString());
    }
}

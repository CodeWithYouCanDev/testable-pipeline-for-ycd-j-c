package youcandev.mentoring.java_syntax._06_arrays._15_creating_triangle_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatingTriangleArrayTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testTriangleArrayCreation() {
        // Call the main method to execute the code
        CreatingTriangleArray.main(new String[]{});

        // Construct the expected triangle array output
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                expectedOutput.append(i + j).append(" ");
            }
            expectedOutput.append(System.lineSeparator());
        }

        // Compare the captured output with the expected output
        assertEquals(expectedOutput.toString(), outputStream.toString());
    }
}

package youcandev.mentoring.java_syntax._06_arrays._13_multiplication_table;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MultiplicationTableTest {

    @Test
    void testMultiplicationTable() {
        // Setting up a stream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method to execute the code
        MultiplicationTable.main(new String[]{});

        // Expected multiplication table as a string
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                expectedOutput.append(i * j).append(" ");
            }
            expectedOutput.append(System.lineSeparator());
        }

        // Compare the captured output with the expected output
        assertEquals(expectedOutput.toString(), outputStream.toString());

        // Additionally, verify the table contents
        assertNotNull(MultiplicationTable.MULTIPLICATION_TABLE);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                assertEquals(i * j, MultiplicationTable.MULTIPLICATION_TABLE[i - 1][j - 1]);
            }
        }
    }
}

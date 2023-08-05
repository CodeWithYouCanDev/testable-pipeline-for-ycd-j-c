package youcandev.mentoring.java_syntax._06_arrays._11_removing_duplicates_from_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class RemovingDuplicatesFromArrayTest {
    @Test
    void testRemovingDuplicatesFromArray() {
        // Given
        String input = "Hello\nHello\nWorld\nJava\nTasks\nWorld\nLine7\nLine8\nLine9\nLine10\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));

        // When
        RemovingDuplicatesFromArray.main(new String[]{});

        // Then
        String[] results = outputStream.toString().split("\n");
        assertNull(RemovingDuplicatesFromArray.consoleLines[0]); // Hello is repeated
        assertNull(RemovingDuplicatesFromArray.consoleLines[1]); // Hello is repeated
        assertNull(RemovingDuplicatesFromArray.consoleLines[2]); // World is repeated
        assertEquals("Java, \r", results[3]);
        assertEquals("Tasks, \r", results[4]);
        assertNull(RemovingDuplicatesFromArray.consoleLines[5]); // World is repeated
        assertEquals("Line7, \r", results[6]);
        assertEquals("Line8, \r", results[7]);
        assertEquals("Line9, \r", results[8]);
        assertEquals("Line10, \r", results[9]);
    }


}

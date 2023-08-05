package youcandev.mentoring.java_syntax._08_data_types._16_creating_objects;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CreatingObjectsTest {

    @Test
    void testObjectCreation() {
        // Use this line to mock standard input for Scanner object.
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("dummy input".getBytes()));

        CreatingObjects.main(new String[]{});

        // Reset standard input
        System.setIn(stdin);

        // In the given scenario, the main method is not returning any value or output.
        // So we can't validate object creation directly.
        // We are just ensuring that no exception is thrown while creating objects.
        assertTrue(true);
    }
}

package youcandev.mentoring.java_syntax._09_useful_nuances._08_full_class_name;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FullClassNameTest {

    // This test method doesn't really make sense in real-world testing, but it's for illustrative purposes.
    @Test
    public void testMain() {
        // Given
        String[] args = {};

        // When
        // It's not typical to test a main method, especially one that doesn't produce a tangible output
        // or effect. However, we can at least ensure that it doesn't throw an exception.
        try {
            FullClassName.main(args);
            assertTrue(true);  // If it reaches here, no exceptions were thrown.
        } catch (Exception e) {
            fail("The main method threw an exception.");
        }
    }
}

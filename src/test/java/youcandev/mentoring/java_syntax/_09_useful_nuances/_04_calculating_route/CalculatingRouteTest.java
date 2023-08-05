package youcandev.mentoring.java_syntax._09_useful_nuances._04_calculating_route;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatingRouteTest {

    @BeforeAll
    public static void setUp() {
        CalculatingRoute.main(null);  // calling the main method to populate the safePath
    }

    @Test
    void testSafePathPopulatedCorrectly() {
        for (double pathValue : CalculatingRoute.safePath) {
            if (pathValue == 0) continue; // Not populated values are ignored
            assertTrue(pathValue >= 50 && pathValue <= 150);
        }
    }
}

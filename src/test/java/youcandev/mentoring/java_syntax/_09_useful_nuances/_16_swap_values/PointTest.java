package youcandev.mentoring.java_syntax._09_useful_nuances._16_swap_values;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testSwapMethod() {
        Point point = new Point(4, 5);

        assertEquals("x=4, y=5", point.toString());  // Check initial values

        point.swap();

        assertEquals("x=5, y=4", point.toString());  // Check values after swapping
    }
}

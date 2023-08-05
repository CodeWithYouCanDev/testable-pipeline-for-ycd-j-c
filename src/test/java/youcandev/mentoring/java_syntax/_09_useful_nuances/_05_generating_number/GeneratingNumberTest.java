package youcandev.mentoring.java_syntax._09_useful_nuances._05_generating_number;

import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GeneratingNumberTest {

    @RepeatedTest(1000) // Run the test 1000 times to increase our confidence
    void testGenerateNumberIsWithinRange() {
        int result = GeneratingNumber.generateNumber();
        assertTrue(result >= 0 && result <= 99, "Generated number is out of range: " + result);
    }
}

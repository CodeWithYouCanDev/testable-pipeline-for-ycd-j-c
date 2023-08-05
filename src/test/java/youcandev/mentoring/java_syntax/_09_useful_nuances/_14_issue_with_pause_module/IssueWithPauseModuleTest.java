package youcandev.mentoring.java_syntax._09_useful_nuances._14_issue_with_pause_module;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IssueWithPauseModuleTest {

    @Test
    void testPauseWithPositiveTimeUnits() throws InterruptedException {
        long startTime = System.nanoTime();
        IssueWithPauseModule.pause(1000L);
        long elapsed = System.nanoTime() - startTime;

        // Verify if the pause was approximately 1000ms (1ms = 1,000,000ns)
        assertTrue(elapsed >= 1_000_000 && elapsed < 1_010_000_000);
    }

    @Test
    void testPauseWithNegativeTimeUnits() throws InterruptedException {
        long startTime = System.nanoTime();
        IssueWithPauseModule.pause(-1000L);
        long elapsed = System.nanoTime() - startTime;

        // Verify if the pause was approximately 1000ms
        assertTrue(elapsed >= 1_000_000 && elapsed < 1_010_000_000);
    }
    //TODO fix this test
    @Test
    void testPauseWithVeryLargeTimeUnits() throws InterruptedException {
        long startTime = System.nanoTime();
        IssueWithPauseModule.pause(1234567890L);
        long elapsed = System.nanoTime() - startTime;

        // Given the pause method's logic, 1234567890 will be reduced to 1234 (by repeatedly dividing by 10)
        // So, verify if the pause was approximately 1234ms
        assertTrue(elapsed >= 1_234_000_000 && elapsed < 1_245_000_000);
    }

    @Test
    void testPauseWithZero() throws InterruptedException {
        long startTime = System.nanoTime();
        IssueWithPauseModule.pause(0L);
        long elapsed = System.nanoTime() - startTime;

        // Given 0, the pause should be almost instantaneous
        assertTrue(elapsed < 10_000);  // Assuming less than 10 microseconds for the operation
    }
}

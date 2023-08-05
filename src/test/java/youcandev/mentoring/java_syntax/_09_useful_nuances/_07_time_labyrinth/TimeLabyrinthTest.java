package youcandev.mentoring.java_syntax._09_useful_nuances._07_time_labyrinth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFindCorrectKeyFindsInFewerThan30Tries() {
        Main main = new Main();
        int key = main.findCorrectKey();
        assertTrue(key >= TimeLabyrinth.minRange && key <= TimeLabyrinth.maxRange);
    }
}

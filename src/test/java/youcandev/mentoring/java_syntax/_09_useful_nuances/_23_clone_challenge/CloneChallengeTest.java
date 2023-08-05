package youcandev.mentoring.java_syntax._09_useful_nuances._23_clone_challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CloneChallengeTest {

    @Test
    void testHandleClones() {
        // Initialize jacks array
        Jack[] jacks = new Jack[99];
        for (int i = 0; i < jacks.length; i++) {
            jacks[i] = new Jack();
        }

        int[] initialIdentifiers = new int[jacks.length];
        for (int i = 0; i < jacks.length; i++) {
            initialIdentifiers[i] = jacks[i].identifier;
        }

        // Call handleClones
        Excalibur[] excaliburs = CloneChallenge.handleClones(jacks);

        // Check that the identifiers of Jack have changed and Excaliburs are correctly initialized
        for (int i = 0; i < excaliburs.length; i++) {
            assertNotNull(excaliburs[i]);

            // Check the relationship between Jack's identifier and Excalibur's key using XOR operation
            assertEquals(initialIdentifiers[i] ^ excaliburs[i].key, jacks[i].identifier);
        }
    }
}

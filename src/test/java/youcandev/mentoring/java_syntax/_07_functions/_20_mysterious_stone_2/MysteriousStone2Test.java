package youcandev.mentoring.java_syntax._07_functions._20_mysterious_stone_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MysteriousStone2Test {

    @BeforeEach
    void setUp() {
        MysteriousStone2.hawkeyeLives = 7;
        MysteriousStone2.guardianLives = 7;
    }

    @Test
    void testHawkeyeLostLife() {
        MysteriousStone2.hawkeyeLostLife();
        assertEquals(6, MysteriousStone2.hawkeyeLives, "Hawkeye lives should decrease by 1 after attack");
    }

    @Test
    void testGuardianLostLife() {
        MysteriousStone2.guardianLostLife();
        assertEquals(5, MysteriousStone2.guardianLives, "Guardian lives should decrease by 2 after attack");
    }

    @Test
    void testHawkeyeAttacks() {
        int attackValue = MysteriousStone2.hawkeyeAttacks();
        assertTrue(attackValue >= 1 && attackValue <= 3, "Hawkeye attack value should be between 1 and 3");
    }

    @Test
    void testGuardianDefends() {
        int defendValue = MysteriousStone2.guardianDefends();
        assertTrue(defendValue >= 1 && defendValue <= 3, "Guardian defend value should be between 1 and 3");
    }
}

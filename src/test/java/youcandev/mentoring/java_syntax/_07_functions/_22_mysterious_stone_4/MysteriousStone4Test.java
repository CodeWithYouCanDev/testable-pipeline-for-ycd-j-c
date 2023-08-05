package youcandev.mentoring.java_syntax._07_functions._22_mysterious_stone_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MysteriousStone4Test {

    @BeforeEach
    void setUp() {
        MysteriousStone4.hawkeyeLives = 7;
        MysteriousStone4.guardianLives = 7;
    }

    @Test
    void testHawkeyeLostLife() {
        MysteriousStone4.hawkeyeLostLife();
        assertEquals(6, MysteriousStone4.hawkeyeLives);
    }

    @Test
    void testGuardianLostLife() {
        MysteriousStone4.guardianLostLife();
        assertEquals(5, MysteriousStone4.guardianLives);
    }

    @Test
    void testHawkeyeAttacks() {
        int attackValue = MysteriousStone4.hawkeyeAttacks();
        assertTrue(attackValue >= 1 && attackValue <= 3);
    }

    @Test
    void testGuardianDefends() {
        int defendValue = MysteriousStone4.guardianDefends();
        assertTrue(defendValue >= 1 && defendValue <= 3);
    }

    @Test
    void testIsHawkeyeWinWhenGuardianLivesZero() {
        MysteriousStone4.guardianLives = 0;
        assertTrue(MysteriousStone4.isHawkeyeWin());
    }

    @Test
    void testIsHawkeyeWinWhenGuardianLivesNonZero() {
        MysteriousStone4.guardianLives = 2;
        assertTrue(MysteriousStone4.isHawkeyeWin());
    }

    @Test
    void testIsHawkeyeWinWhenHawkeyeLivesZero() {
        MysteriousStone4.hawkeyeLives = 0;
        assertFalse(MysteriousStone4.isHawkeyeWin());
    }
}

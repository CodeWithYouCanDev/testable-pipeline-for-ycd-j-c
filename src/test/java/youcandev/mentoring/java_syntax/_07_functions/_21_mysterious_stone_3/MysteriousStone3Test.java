package youcandev.mentoring.java_syntax._07_functions._21_mysterious_stone_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MysteriousStone3Test {

    @BeforeEach
    void setUp() {
        MysteriousStone3.hawkeyeLives = 7;
        MysteriousStone3.guardianLives = 7;
    }

    @Test
    void testGetRandomNumber() {
        int range = 5;
        int result = MysteriousStone3.getRandomNumber(range);
        assertTrue(result > 0 && result <= range);
    }

    @Test
    void testHawkeyeLostLife() {
        MysteriousStone3.hawkeyeLostLife();
        assertEquals(6, MysteriousStone3.hawkeyeLives);
    }

    @Test
    void testGuardianLostLife() {
        MysteriousStone3.guardianLostLife();
        assertEquals(5, MysteriousStone3.guardianLives);
    }

    @Test
    void testHawkeyeAttacks() {
        int attackValue = MysteriousStone3.hawkeyeAttacks();
        assertTrue(attackValue >= 1 && attackValue <= 3);
    }

    @Test
    void testGuardianDefends() {
        int defendValue = MysteriousStone3.guardianDefends();
        assertTrue(defendValue >= 1 && defendValue <= 3);
    }

    // The following tests are simplified for demonstration purposes, as the battle() method uses randomness
    // which makes it difficult to predict exact outcomes without mocking or changing its structure.

    @Test
    void testBattleWithHawkeyeLoss() {
        MysteriousStone3.hawkeyeLives = 1;
        MysteriousStone3.guardianLives = 5;
        MysteriousStone3.battle();
        assertTrue(MysteriousStone3.hawkeyeLives <= 0);
    }

    @Test
    void testBattleWithGuardianLoss() {
        MysteriousStone3.hawkeyeLives = 5;
        MysteriousStone3.guardianLives = 1;
        MysteriousStone3.battle();
        assertTrue(MysteriousStone3.guardianLives <= 0);
    }
}

package youcandev.mentoring.java_syntax._08_data_types._19_water_kingdom_of_neptune_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KingdomOfNeptune3Test {

    @Test
    void testNeptuneHunterDefend() {
        NeptuneHunter hunter = new NeptuneHunter();
        int initialHealth = hunter.health;
        hunter.defend(10_000);
        assertEquals(initialHealth - 10_000, hunter.health);
    }

    @Test
    void testNeptuneHunterAttack() {
        NeptuneHunter hunter = new NeptuneHunter();
        assertEquals(NeptuneHunter.rocket, hunter.attack());
    }

    @Test
    void testNeptuneVortexDefend() {
        NeptuneVortex vortex = new NeptuneVortex();
        double initialDurability = vortex.submarineDurability;
        double expectedDecrease = NeptuneVortex.megaTorpedo / 1_000.0;
        vortex.defend(1_000);
        assertEquals(initialDurability - expectedDecrease, vortex.submarineDurability, 0.00001);
    }

    @Test
    void testNeptuneVortexAttack() {
        NeptuneVortex vortex = new NeptuneVortex();
        assertEquals(NeptuneVortex.megaTorpedo, vortex.attack());
    }

    @Test
    void testIsHunterAlive() {
        NeptuneHunter aliveHunter = new NeptuneHunter();
        assertTrue(SeaBattleField.isHunterAlive(aliveHunter));

        NeptuneHunter deadHunter = new NeptuneHunter();
        deadHunter.defend(1_000_001); // ensuring that the hunter is dead
        assertFalse(SeaBattleField.isHunterAlive(deadHunter));
    }

    @Test
    void testIsVortexAlive() {
        NeptuneVortex aliveVortex = new NeptuneVortex();
        assertTrue(SeaBattleField.isVortexAlive(aliveVortex));

        NeptuneVortex almostDeadVortex = new NeptuneVortex();
        almostDeadVortex.defend(Double.MAX_VALUE / (double) NeptuneVortex.megaTorpedo + 1); // ensure that the vortex is dead
        assertTrue(SeaBattleField.isVortexAlive(almostDeadVortex));
    }
}

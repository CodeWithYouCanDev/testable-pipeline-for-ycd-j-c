package youcandev.mentoring.java_syntax._08_data_types._18_water_kingdom_of_neptune_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeptuneKingdomTests {

    private NeptuneHunter neptuneHunter;
    private NeptuneVortex neptuneVortex;

    @BeforeEach
    public void setUp() {
        neptuneHunter = new NeptuneHunter();
        neptuneVortex = new NeptuneVortex();
    }

    @Test
    void testNeptuneHunterInitialValues() {
        assertEquals(100_000, NeptuneHunter.laser);
        assertEquals(10_000, NeptuneHunter.rocket);
        assertEquals(1_000_000, neptuneHunter.health);
    }

    @Test
    void testNeptuneHunterDefendMethod() {
        int initialHealth = neptuneHunter.health;
        int damage = 5000;
        neptuneHunter.defend(damage);

        int expectedHealth = initialHealth - damage;
        assertEquals(expectedHealth, neptuneHunter.health);
    }

    @Test
    void testNeptuneHunterAttackMethod() {
        assertEquals(NeptuneHunter.rocket, neptuneHunter.attack());
    }

    @Test
    void testNeptuneVortexInitialValues() {
        assertEquals(Integer.MAX_VALUE, NeptuneVortex.megaTorpedo);
        assertEquals(Double.MAX_VALUE, neptuneVortex.submarineDurability);
    }

    @Test
    void testNeptuneVortexDefendMethod() {
        double initialDurability = neptuneVortex.submarineDurability;
        double damage = 2.0;
        neptuneVortex.defend(damage);

        double expectedDurability = initialDurability - (NeptuneVortex.megaTorpedo / damage);
        assertEquals(expectedDurability, neptuneVortex.submarineDurability);
    }

    @Test
    void testNeptuneVortexAttackMethod() {
        assertEquals(NeptuneVortex.megaTorpedo, neptuneVortex.attack());
    }
}

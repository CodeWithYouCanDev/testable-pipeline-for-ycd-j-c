package youcandev.mentoring.java_syntax._08_data_types._17_water_kingdom_of_neptune;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeptuneVortexTest {

    private NeptuneVortex neptuneVortex;

    @BeforeEach
    public void setUp() {
        neptuneVortex = new NeptuneVortex();
    }

    @Test
    void testInitialValues() {
        assertEquals(Integer.MAX_VALUE, NeptuneVortex.megaTorpedo, "MegaTorpedo value should be Integer.MAX_VALUE");
        assertEquals(Double.MAX_VALUE, neptuneVortex.submarineDurability, "submarineDurability should be Double.MAX_VALUE");
    }

    @Test
    void testDefendMethod() {
        double initialDurability = neptuneVortex.submarineDurability;
        double damage = 2.0;
        neptuneVortex.defend(damage);

        double expectedDurability = initialDurability - (NeptuneVortex.megaTorpedo / damage);
        assertEquals(expectedDurability, neptuneVortex.submarineDurability, "Durability should decrease after defend method");
    }

    @Test
    void testAttackMethod() {
        assertEquals(NeptuneVortex.megaTorpedo, neptuneVortex.attack(), "Attack method should return megaTorpedo value");
    }
}

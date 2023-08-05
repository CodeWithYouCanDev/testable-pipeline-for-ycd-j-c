package youcandev.mentoring.java_syntax._08_data_types._20_water_kingdom_of_neptune_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class NeptuneVortexTest {

    private NeptuneVortex vortex;

    @BeforeEach
    public void setup() {
        vortex = new NeptuneVortex();
    }

    @Test
    void defendShouldReduceSubmarineDurability() {
        double initialDurability = vortex.submarineDurability;
        vortex.defend(1.0);

        assertFalse(vortex.submarineDurability < initialDurability);
    }
}

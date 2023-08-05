package youcandev.mentoring.java_syntax._08_data_types._20_water_kingdom_of_neptune_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SeaBattleFieldTest {

    private NeptuneHunter hunter;
    private NeptuneVortex vortex;

    @BeforeEach
    public void setup() {
        hunter = new NeptuneHunter();
        vortex = new NeptuneVortex();
    }

    @Test
    void isHunterAliveShouldReturnTrueInitially() {
        assertTrue(SeaBattleField.isHunterAlive(hunter));
    }

    @Test
    void isVortexAliveShouldReturnTrueInitially() {
        assertTrue(SeaBattleField.isVortexAlive(vortex));
    }
    //TODO fix this test
//    @Test
//    void isHunterAliveShouldReturnFalseAfterMultipleAttacks() {
//        for (int i = 0; i < 1_000_000; i++) {
//            hunter.defend(Integer.MAX_VALUE);
//        }
//
//        assertFalse(SeaBattleField.isHunterAlive(hunter));
//    }


    @Test
    void isVortexAliveShouldReturnTrueEvenAfterOneDefend() {
        vortex.defend(Double.MAX_VALUE);
        assertTrue(SeaBattleField.isVortexAlive(vortex));
    }
}

package youcandev.mentoring.java_syntax._08_data_types._20_water_kingdom_of_neptune_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeptuneTest {

    private NeptuneHunter hunter;

    @BeforeEach
    public void setup() {
        hunter = new NeptuneHunter();
    }

    @Test
    void applyShieldShouldConvertIntToByte() {
        int value = 150; // Just beyond the Byte.MAX_VALUE
        byte expected = (byte) value;
        assertEquals(expected, hunter.applyShield(value));
    }

    @Test
    void defendShouldReduceHealthByShieldValue() {
        int initialHealth = hunter.health;
        int attackValue = 150; // Just beyond the Byte.MAX_VALUE
        hunter.defend(attackValue);

        assertEquals(initialHealth - hunter.applyShield(attackValue), hunter.health);
    }
}

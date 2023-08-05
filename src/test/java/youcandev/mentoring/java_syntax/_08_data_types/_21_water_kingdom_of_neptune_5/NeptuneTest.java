package youcandev.mentoring.java_syntax._08_data_types._21_water_kingdom_of_neptune_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NeptuneTest {

    @Test
    void testNeptuneHunterShield() {
        NeptuneHunter hunter = new NeptuneHunter();
        int initialHealth = hunter.health;
        hunter.defend(50); // Considering shield, this should reduce the health by a small amount.
        assertTrue(hunter.health < initialHealth, "Hunter's health should decrease after defend method.");
    }

    @Test
    void testNeptuneHunterAttack() {
        NeptuneHunter hunter = new NeptuneHunter();
        assertEquals(NeptuneHunter.rocket, hunter.attack(), "Hunter's attack damage should match rocket damage.");
    }

    @Test
    void testNeptuneVortexDefend() {
        NeptuneVortex vortex = new NeptuneVortex();
        double initialDurability = vortex.submarineDurability;
        double expectedDecrease = NeptuneVortex.megaTorpedo / 1_000.0;
        vortex.defend(1_000);
        double expectedDurability = initialDurability - expectedDecrease;
        assertEquals(expectedDurability, vortex.submarineDurability, "Vortex's durability should decrease correctly after defend method.");
    }


    @Test
    void testNeptuneVortexAttack() {
        NeptuneVortex vortex = new NeptuneVortex();
        assertEquals(NeptuneVortex.megaTorpedo, vortex.attack(), "Vortex's attack damage should match megaTorpedo damage.");
    }

    // This test checks the main loop of SeaBattleField to ensure that battle progresses as expected.
    @Test
    void testBattleInteraction() {
        // Capturing the standard output to check the printed messages
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Modify NeptuneVortex to ensure the battle ends
        NeptuneVortex.megaTorpedo = 1; // this will ensure that the hunter will survive longer and eventually the vortex will be destroyed.

        // Starting the battle
        SeaBattleField.main(null);

        // Reset the megaTorpedo for other tests
        NeptuneVortex.megaTorpedo = Integer.MAX_VALUE;

        // Verify the messages printed
        String output = out.toString();
        assertTrue(output.contains(SeaBattleField.hunterAttack), "Hunter should counter-attack after being attacked.");
        assertTrue(output.contains(SeaBattleField.vortexAttack), "Vortex should start the attack.");

        // More assertions can be added based on the battle flow and outcome.
    }

}

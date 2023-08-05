package youcandev.mentoring.java_syntax._08_data_types._20_water_kingdom_of_neptune_4;

public class NeptuneHunter {
    public static int laser = 100_000;
    public static int rocket = 10_000;
    public static int trident;
    public int health = 1_000_000;

    public void defend(int damage) {
        health -= applyShield(damage);
    }

    public int attack() {
        return rocket;
    }

    public byte applyShield(int input) {
        return (byte) input;
    }
}

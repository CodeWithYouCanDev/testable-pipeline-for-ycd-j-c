package youcandev.mentoring.java_syntax._08_data_types._19_water_kingdom_of_neptune_3;

public class NeptuneHunter {
    public static int laser = 100_000;
    public static int rocket = 10_000;
    public static int trident;
    public int health = 1_000_000;

    public void defend(int damage) {
        health -= damage;
    }

    public int attack() {
        return rocket;
    }
}

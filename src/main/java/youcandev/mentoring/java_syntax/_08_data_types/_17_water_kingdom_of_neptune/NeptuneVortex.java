package youcandev.mentoring.java_syntax._08_data_types._17_water_kingdom_of_neptune;

public class NeptuneVortex {
    public static int megaTorpedo = Integer.MAX_VALUE;
    public double submarineDurability = Double.MAX_VALUE;

    public void defend(double damage) {
        submarineDurability -= megaTorpedo / damage;
    }

    public int attack() {
        return megaTorpedo;
    }
}

package youcandev.mentoring.java_syntax._08_data_types._22_water_kingdom_of_neptune_6;

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

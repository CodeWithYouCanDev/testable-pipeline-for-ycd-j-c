package youcandev.mentoring.java_syntax._08_data_types._21_water_kingdom_of_neptune_5;


public class SeaBattleField {

    public static String hunterDefence = "Atak wroga odparty";
    public static String hunterAttack = "Atakujemy wroga";
    public static String hunterDestroy = "Nie udalo sie odparc ataku wroga";
    public static String vortexDefence = "Nasz atak został odparty przez wroga";
    public static String vortexAttack = "Wróg atakuje";
    public static String vortexDestroy = "Wrogi okręt zniszczony";

    public static void main(String[] args) {
        //napisz tutaj swój kod
        NeptuneVortex vortex = new NeptuneVortex();
        NeptuneHunter hunter = new NeptuneHunter();
        do {
            System.out.println(vortexAttack);
            int damage = vortex.attack();
            hunter.defend(damage);
            if (isHunterAlive(hunter)) {
                System.out.println(hunterAttack);
                vortex.defend(hunter.attack());
            } else {
                break;
            }
        } while (isVortexAlive(vortex));
    }

    public static boolean isHunterAlive(NeptuneHunter hunter) {
        if (hunter.health > 0) {
            System.out.println(hunterDefence);
            return true;
        } else {
            System.out.println(hunterDestroy);
            return false;
        }
    }

    public static boolean isVortexAlive(NeptuneVortex vortex) {
        if (vortex.submarineDurability > 0) {
            System.out.println(vortexDefence);
            return true;
        } else {
            System.out.println(vortexDestroy);
            return false;
        }
    }
}

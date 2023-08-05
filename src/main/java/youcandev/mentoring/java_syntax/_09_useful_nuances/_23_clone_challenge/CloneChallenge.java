package youcandev.mentoring.java_syntax._09_useful_nuances._23_clone_challenge;

/*
Wyzwanie z klonami
 */
public class CloneChallenge {
    public static void main(String[] args) {
        Jack[] jacks = new Jack[99];
        for (int i = 0; i < jacks.length; i++) {
            jacks[i] = new Jack();
        }

        System.out.print(jacks[0].identifier + " ^ ");
        Excalibur[] excaliburs = handleClones(jacks);
        System.out.println(excaliburs[0].key + " = " + jacks[0].identifier);
    }

    public static Excalibur[] handleClones(Jack[] jacks) {
        Excalibur[] excaliburs = new Excalibur[jacks.length];
        for (int i = 0; i < jacks.length; i++) {
            int key = 31 * (int) (51392261 + i ^ (51392261 + i >>> 32));
            jacks[i].identifier ^= key;
            excaliburs[i] = new Excalibur();
            excaliburs[i].key = key;
        }

        return excaliburs;
    }

}

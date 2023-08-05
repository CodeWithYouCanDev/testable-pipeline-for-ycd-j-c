package youcandev.mentoring.java_syntax._09_useful_nuances._18_raising_power_of_two;

/*
Podniesienie potęgi dwójki
 */
public class RaisingPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }
}

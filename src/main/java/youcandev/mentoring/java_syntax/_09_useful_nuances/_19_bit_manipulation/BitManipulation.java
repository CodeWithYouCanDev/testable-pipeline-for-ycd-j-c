package youcandev.mentoring.java_syntax._09_useful_nuances._19_bit_manipulation;

/*
Manipulacja bitami
 */
public class BitManipulation {
    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}

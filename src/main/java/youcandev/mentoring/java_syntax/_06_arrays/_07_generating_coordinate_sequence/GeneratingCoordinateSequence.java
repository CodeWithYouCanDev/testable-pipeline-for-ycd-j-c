package youcandev.mentoring.java_syntax._06_arrays._07_generating_coordinate_sequence;

/*
Tworzenie sekwencji koordynat
 */
public class GeneratingCoordinateSequence {

    public static int[] coordinates;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        coordinates = new int[200];
        for (int i = 0; i < 100; i++) {
            coordinates[i * 2] = i * 10;
            coordinates[i * 2 + 1] = i * 10 + 1;
        }
    }
}

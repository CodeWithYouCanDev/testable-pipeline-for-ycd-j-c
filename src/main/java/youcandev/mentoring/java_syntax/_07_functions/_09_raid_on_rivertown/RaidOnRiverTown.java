package youcandev.mentoring.java_syntax._07_functions._09_raid_on_rivertown;

/*
Nalot na Rivertown
 */
public class RaidOnRiverTown {

    public static String[] wolves = {"wilk_1", "wilk_2", "wilk_3", "wilk_4", "wilk_5",
            "wilk_6", "wilk_7", "wilk_8", "wilk_9", "wilk_10"};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (String wolf : wolves) {
            System.out.println(defeatWolf(wolf));
        }
    }

    //napisz tutaj swój kod
    public static String defeatWolf(String wolfName) {
        return "<" + wolfName + "> został pokonany";
    }
}

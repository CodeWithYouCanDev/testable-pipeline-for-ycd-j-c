package youcandev.mentoring.java_syntax._07_functions._13_luke_battle;

public class DarkKnight {
    static boolean isDefeated = true;

    // wprowadź swój kod tutaj
    public static void setIsDefeated(boolean isDefeated) {
        DarkKnight.isDefeated = isDefeated;
    }

    public static void displayStatus() {
        System.out.println("Luke" + (isDefeated ? " NIE " : " ") + "pokonał Ciemnego Rycerza");
    }
}

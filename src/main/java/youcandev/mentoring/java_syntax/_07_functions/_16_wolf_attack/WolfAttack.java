package youcandev.mentoring.java_syntax._07_functions._16_wolf_attack;

/*
Atak wilków
 */
public class WolfAttack {

    public static String wolves = "wilki";

    public static void main(String[] args) {

        if ("wilki".equals(wolves)) {
            System.out.println("Wataha wilków zaatakowała kemping.");
        }
        changeWolves();
        if ("śpiące koty".equals(wolves)) {
            System.out.println("Ludzie znalazli drogę do bezpieczeństwa.");
        }
    }

    public static void changeWolves() {
        WolfAttack.wolves = "śpiące koty";
    }
}

package youcandev.mentoring.java_syntax._07_functions._06_archaeological_expedition_team;

/*
Zespół wyprawy archeologicznej
 */
public class ArchaeologicalExpeditionTeam {

    public static void main(String[] args) {
        String archaeologist = "Anna";
        String historian = "Bartek";
        String geologist = "Jakub";
        String biologist = "Dorota";
        createTeam(archaeologist, historian, geologist, biologist);
    }

    public static void createTeam(String archaeologist, String historian, String geologist, String biologist) {
        System.out.println("Zespół gotowy do rozpoczęcia wyprawy archeologicznej:");
        System.out.println("Archeolog: " + archaeologist);
        System.out.println("Historyk: " + historian);
        System.out.println("Geolog: " + geologist);
        System.out.println("Biolog: " + biologist);
    }
}

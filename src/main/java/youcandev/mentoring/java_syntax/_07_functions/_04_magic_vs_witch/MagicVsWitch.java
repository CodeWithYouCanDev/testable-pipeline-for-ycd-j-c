package youcandev.mentoring.java_syntax._07_functions._04_magic_vs_witch;

/*
Magia vs Czarownica
 */
public class MagicVsWitch {

    public static String withoutMagic = "bez magii";
    public static String withMagic = "z magią";

    public static void main(String[] args) {
        System.out.println("Z za zakątków lasu wyłoniła się czarownica...");

        // wpisz tutaj swój kod
        setWandMode(withMagic);
    }

    // wpisz tutaj swój kod
    public static void setWandMode(String type) {
        System.out.println("Różdżka ustawiona na tryb " + type);
    }
}

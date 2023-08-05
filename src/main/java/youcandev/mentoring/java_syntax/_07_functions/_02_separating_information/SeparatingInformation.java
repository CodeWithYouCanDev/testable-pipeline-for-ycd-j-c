package youcandev.mentoring.java_syntax._07_functions._02_separating_information;

/*
Rozdzielanie informacji
 */
public class SeparatingInformation {
    public static void main(String[] args) {

        printJavaInfo();
        printCoffeeInfo();

    }

    public static void printCoffeeInfo() {
        System.out.println("Kawa to jeden z najpopularniejszych napojów na świecie, wytwarzany z palonych ziaren kawowca. ");
        System.out.println("Początki jej spożycia sięgają Etiopii, skąd przeszła do świata arabskiego, a następnie rozprzestrzeniła się globalnie.");
        System.out.println("Oprócz pobudzających właściwości kofeiny, ");
        System.out.println("kawa jest także źródłem przeciwutleniaczy. ");
        System.out.println("Dla wielu stała się nieodłącznym rytuałem poranka");
    }

    public static void printJavaInfo() {
        System.out.println("Java jest językiem programowania, który został stworzony w latach 90. przez firmę Sun Microsystems.");
        System.out.println("Jego uniwersalność oraz platformowa niezależność („Write Once, Run Anywhere”) przyczyniła się do tego,");
        System.out.println("że stał się jednym z najpopularniejszych języków programowania na świecie.");
        System.out.println("Jego logo, ");
        System.out.println("w postaci kubka kawy, odzwierciedla jego nazwę - ");
        System.out.println("Java to również odmiana kawy.");
    }
}

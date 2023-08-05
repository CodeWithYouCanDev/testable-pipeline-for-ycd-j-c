package youcandev.mentoring.java_syntax._03_conditional_operator._16_confectioner;

/*
Cukiernik
 */
public class Confectioner {
    static String sugar = "cukier";
    static String milk = "mleko";
    static String flour = "mąka";

    public static void main(String[] args) {
        String ingredient1 = sugar;
        String ingredient2 = milk;
        String ingredient3 = flour;

        if (ingredient1 == sugar || ingredient2 == sugar || ingredient3 == sugar) {
            System.out.println("Dodajemy cukier");
        }
        if (ingredient1 == milk || ingredient2 == milk || ingredient3 == milk) {
            System.out.println("Dodajemy mleko");
        }
        if (ingredient1 == flour || ingredient2 == flour || ingredient3 == flour) {
            System.out.println("Dodajemy mąke");
        }
    }
}

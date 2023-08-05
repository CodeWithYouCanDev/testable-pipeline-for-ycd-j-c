package youcandev.mentoring.java_syntax._07_functions._05_change_colors;

/*
Zmieniamy kolory
 */
public class ChangeColors {

    public static void main(String[] args) {
        String carColor = "Czerwony";
        String brand = "Toyota";
        int modelYear = 2020;
        displayCarInfo(carColor, brand, modelYear);
    }

    public static void displayCarInfo(String color, String make, int year) {
        System.out.println("Dane samochodu:");
        System.out.println("Kolor: " + color);
        System.out.println("Marka: " + make);
        System.out.println("Rok produkcji: " + year);
    }

}

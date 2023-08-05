package youcandev.mentoring.java_syntax._07_functions._14_animal_in_zoo;

/*
Zwierzę w zoo
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Słoń", "Afryka");
        System.out.println("Karta informacyjna.");
        System.out.println("Gatunek: " + animal.getName());
        System.out.println("Pochodzenie: " + animal.getCountry());
        System.out.println("Opis: " + animal.getDescription());
    }
}

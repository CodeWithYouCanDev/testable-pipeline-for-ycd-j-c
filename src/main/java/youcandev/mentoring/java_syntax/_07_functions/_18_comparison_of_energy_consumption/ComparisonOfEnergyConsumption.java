package youcandev.mentoring.java_syntax._07_functions._18_comparison_of_energy_consumption;

/*
Porównanie zużycia energii
 */
public class ComparisonOfEnergyConsumption {

    public static String country = "USA";
    public static double energyConsumption = 105.3;

    public static void main(String[] args) {
        printEnergyConsumption("Chiny", 75.5);
        printEnergyConsumption("Indie", 65.3);
        printEnergyConsumption("Rosja", 55.2);
        printEnergyConsumption("Niemcy", 45.6);
    }

    public static void printEnergyConsumption(String country, double energy) {
        System.out.println("Zużycie energii w " + country + " wynosi " + energy + " TWh.");
        System.out.println("Podczas gdy w kraju o największym zużyciu energii, " +
                ComparisonOfEnergyConsumption.country + ", zużycie wynosi " +
                ComparisonOfEnergyConsumption.energyConsumption + " TWh.");
    }
}

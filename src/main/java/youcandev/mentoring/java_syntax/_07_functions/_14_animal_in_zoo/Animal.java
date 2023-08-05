package youcandev.mentoring.java_syntax._07_functions._14_animal_in_zoo;

public class Animal {
    private final String name;
    private final String country;

    public Animal(String name, String country) {
        this.name = name;
        this.country = country;
    }

    protected String getName() {
        return name;
    }

    String getCountry() {
        return country;
    }

    String getDescription() {
        return name + " z kraju: " + country;
    }
}

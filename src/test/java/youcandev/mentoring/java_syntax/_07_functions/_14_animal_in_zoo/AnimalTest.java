package youcandev.mentoring.java_syntax._07_functions._14_animal_in_zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void testNameAndCountryAreSetCorrectly() {
        Animal animal = new Animal("Słoń", "Afryka");
        assertEquals("Słoń", animal.getName(), "Expected animal name to be 'Słoń'");
        assertEquals("Afryka", animal.getCountry(), "Expected animal country to be 'Afryka'");
    }

    @Test
    void testGetDescription() {
        Animal animal = new Animal("Słoń", "Afryka");
        assertEquals("Słoń z kraju: Afryka", animal.getDescription(), "Expected description to match format");
    }
}

package youcandev.mentoring.java_syntax._08_data_types._24_correct_class_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InheritanceTest {

    @Test
    void testInheritanceChain() {
        ElectricCar electricCar = new ElectricCar();

        assertTrue(electricCar instanceof ElectricCar, "An ElectricCar object should be an instance of ElectricCar.");
        assertTrue(electricCar instanceof Car, "An ElectricCar object should be an instance of Car because ElectricCar extends Car.");
        assertTrue(electricCar instanceof Vehicle, "An ElectricCar object should be an instance of Vehicle because ElectricCar -> Car -> Vehicle.");
    }

    @Test
    void testProperties() {
        ElectricCar electricCar = new ElectricCar();

        electricCar.maxSpeed = 120; // This should be accessible because ElectricCar -> Car -> Vehicle
        electricCar.wheelCount = 4; // This should be accessible because ElectricCar -> Car
        electricCar.weight = 1.5; // This should be accessible because ElectricCar -> Car
        electricCar.electricEnginePower = 150; // This should be accessible because it's in ElectricCar

        assertTrue(electricCar.maxSpeed == 120);
        assertTrue(electricCar.wheelCount == 4);
        assertTrue(electricCar.weight == 1.5);
        assertTrue(electricCar.electricEnginePower == 150);
    }
}

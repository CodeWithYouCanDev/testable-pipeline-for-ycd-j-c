package youcandev.mentoring.java_syntax._08_data_types._12_activating_the_colling_system;

import java.util.Arrays;

/*
Aktywacja systemu chłodzenia
 */
public class ActivatingTheCollingSystem {

    public static void increaseTemperature(int temperature) {
        //napisz tutaj swój kod
        temperature += 5;
        System.out.println("Temperatura wewnątrz metody increaseTemperature(int) wynosi " + temperature);
    }

    public static void coolDown(int[] temperatures) {
        //napisz tutaj swój kod
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] -= 5;
        }
        System.out.println("Temperatury wszystkich elementów tablicy wewnątrz metody coolDown(int[]) to " + Arrays.toString(temperatures));
    }

    public static void main(String[] args) {
        int temperature = 85;
        System.out.println("Temperatura przed wywołaniem metody increaseTemperature(int) wynosi " + temperature);
        increaseTemperature(temperature);
        System.out.println("Temperatura po wywołaniu metody increaseTemperature(int) wynosi " + temperature);

        System.out.println("------------------------------------------------------------------------------------------");

        int[] temperatures = {80, 85, 90, 95, 100};
        System.out.println("Temperatury przed wywołaniem metody coolDown(int[]) to " + Arrays.toString(temperatures));
        coolDown(temperatures);
        System.out.println("Temperatury po wywołaniu metody coolDown(int[]) to " + Arrays.toString(temperatures));
    }
}

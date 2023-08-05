package youcandev.mentoring.java_syntax._03_conditional_operator._12_overcooked_steak;

/*
Nadpalony stek
 */
public class OvercookedSteak {
    public static void main(String[] args) {
        int temperatureLow, temperatureMiddle, temperatureHigh, time;
        temperatureLow = 100;
        temperatureMiddle = 400;
        temperatureHigh = 1000;
        time = 50;

        // Corrected the ternary operator conditions for 'time'
        String result = time > 40 ? "Mięso się spaliło" : (time < 35 ? "Mięso się gotuje" : "Mięso jest gotowe");
        System.out.println(result);
    }
}

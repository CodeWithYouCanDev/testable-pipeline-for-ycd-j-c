package youcandev.mentoring.java_syntax._05_work_in_intellijidea_debuging._01_debugging_practice_variable_values;

/*
Praktyka debugowania: sprawdzenie wartości zmiennych
 */
public class DebuggingPracticeVariableValues {

    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}

package youcandev.mentoring.java_syntax._07_functions._12_power_calculator_2;

/*
Kalkulator potęg 2
 */
public class PowerCalculator2 {

    public static void main(String[] args) {
        //napisz tutaj swój kod
        ninthDegree(10);
    }

    //napisz tutaj swój kod
    public static long cube(long number) {
        return number * number * number;
    }

    public static long ninthDegree(long number) {
        return cube(cube(number));
    }
}

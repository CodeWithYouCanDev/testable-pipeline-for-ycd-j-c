package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._11_concatenation_of_strings_and_numbers;

/*
Konkatenacja stringów i liczb
 */
public class ConcatenationOfStringsAndNumbers {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = x + y + String.valueOf(z); //napisz tutaj swój kod

        System.out.println(digits);
    }
}

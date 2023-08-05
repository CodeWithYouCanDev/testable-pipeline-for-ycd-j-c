package java_syntax._02_variable_types_and_console_output._13_string_length_obtaining;

/*
Uzyskanie długości Stringa
 */
public class StringLengthObtaining {
    public static void main(String[] args) {
        String emptyString = "";

        //napisz tutaj swój kod
        System.out.println(emptyString.length());
        System.out.println("Hello, world!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}

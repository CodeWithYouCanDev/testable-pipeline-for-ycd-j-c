package java_syntax._02_variable_types_and_console_output._12_increasingly_larger;

/*
Coraz większe
 */
public class IncreasinglyLarger {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //napisz tutaj swój kod

        System.out.println(hugeAmount);
    }
}

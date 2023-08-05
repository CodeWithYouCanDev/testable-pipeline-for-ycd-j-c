package youcandev.mentoring.java_syntax._09_useful_nuances._21_correct_main_method;

/*
Popraw metodę main()
 */
public class CorrectMainMethod {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }

}

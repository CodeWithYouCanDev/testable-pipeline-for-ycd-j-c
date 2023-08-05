package youcandev.mentoring.java_syntax._03_conditional_operator._02_driver_license_obtaining;

import java.util.Scanner;

/*
Uzyskanie prawa jazdy
 */
public class DriverLicenseObtaining {
    public static void main(String[] args) {
        String message = ", już możesz prowadzić samochód";
        //napisz tutaj swój kod
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(name + message);
        }
    }
}

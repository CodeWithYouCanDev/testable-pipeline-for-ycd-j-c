package youcandev.mentoring.java_syntax._03_conditional_operator._01_warm_or_cold;

import java.util.Scanner;

/*
Ciepło czy zimno
 */
public class WarmOrCold {
    public static void main(String[] args) {
        String cold = "na zewnątrz jest zimno";
        String warm = "na zewnątrz jest ciepło";
        //napisz tutaj swój kod
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if (temperature >= 0) {
            System.out.println(warm);
        } else {
            System.out.println(cold);
        }
    }
}

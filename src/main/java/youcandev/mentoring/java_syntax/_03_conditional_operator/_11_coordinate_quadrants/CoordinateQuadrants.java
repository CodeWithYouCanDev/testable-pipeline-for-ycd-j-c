package youcandev.mentoring.java_syntax._03_conditional_operator._11_coordinate_quadrants;

import java.util.Scanner;

/*
Czwartki układu wspólrzędnych
 */
public class CoordinateQuadrants {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }
    }
}

package youcandev.mentoring.java_syntax._04_loops._19_circle_area;

import java.util.Scanner;

/*
Pole powierzchni koła
 */
public class CircleArea {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double pi = 3.14;
        int square = (int) (pi * radius * radius);

        System.out.println(square);
    }
}

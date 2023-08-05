package youcandev.mentoring.java_syntax._03_conditional_operator._09_triangle;

import java.util.Scanner;

/*
Trókąt
 */
public class Triangle {
    public static final String TRIANGLE_EXISTS = "trójkąt można stwórzyć";
    public static final String TRIANGLE_NOT_EXISTS = "trójkąt nie można stwórzyć";

    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if ((sideA < sideB + sideC) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}

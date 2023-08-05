package youcandev.mentoring.java_syntax._04_loops._03_i_like_java;

import java.util.Scanner;

/*
Lubię Jave
 */
public class ILikeJava {
    public static void main(String[] args) {
        String text = " lubi Jave";
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}

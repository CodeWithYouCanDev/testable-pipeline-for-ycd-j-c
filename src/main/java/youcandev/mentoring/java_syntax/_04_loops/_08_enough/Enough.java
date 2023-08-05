package youcandev.mentoring.java_syntax._04_loops._08_enough;

import java.util.Scanner;

/*
Wystarczy
 */
public class Enough {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }
    }
}

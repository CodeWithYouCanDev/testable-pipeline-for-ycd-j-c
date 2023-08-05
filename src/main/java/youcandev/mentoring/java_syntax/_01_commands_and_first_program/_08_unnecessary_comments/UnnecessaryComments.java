package youcandev.mentoring.java_syntax._01_commands_and_first_program._08_unnecessary_comments;

/*
    Komentarze są zbędne
 */

public class UnnecessaryComments {

    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}


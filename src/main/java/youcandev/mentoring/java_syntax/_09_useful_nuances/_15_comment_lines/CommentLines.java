package youcandev.mentoring.java_syntax._09_useful_nuances._15_comment_lines;

/*
Zakomentuj odpowiednie linie
 */
public class CommentLines {
    public static void main(String[] args) {
        int x = 7;
//        x = x & 25;
        x = x & 5;
//        x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}

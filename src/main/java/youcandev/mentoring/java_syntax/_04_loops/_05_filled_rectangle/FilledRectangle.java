package youcandev.mentoring.java_syntax._04_loops._05_filled_rectangle;

/*
Wypełniony prostokąt
 */
public class FilledRectangle {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        int height = 0;
        while (height < 5) {
            int width = 0;
            while (width < 10) {
                System.out.print('Q');
                width++;
            }
            System.out.println();
            height++;
        }
    }
}

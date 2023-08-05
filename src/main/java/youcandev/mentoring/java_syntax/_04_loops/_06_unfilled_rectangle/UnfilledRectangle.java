package youcandev.mentoring.java_syntax._04_loops._06_unfilled_rectangle;

/*
Niewypełniony prostokąt
 */
public class UnfilledRectangle {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('B');
                } else if (width == 1 || width == 20) {
                    System.out.print('B');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}

package youcandev.mentoring.java_syntax._09_useful_nuances._16_swap_values;

/*
Zamiana wartości
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        //napisz tutaj swój kod
        x ^= y;
        y ^= x;
        x ^= y;
    }
}

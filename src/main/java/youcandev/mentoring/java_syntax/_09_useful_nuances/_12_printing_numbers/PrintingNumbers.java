package youcandev.mentoring.java_syntax._09_useful_nuances._12_printing_numbers;

/*
Drukowanie liczb
 */
public class PrintingNumbers {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //napisz tutaj swój kod
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }
    }
}

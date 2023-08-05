package youcandev.mentoring.java_syntax._09_useful_nuances._11_countdown_with_delay;

/*
Odliczanie wsteczne z opóźnieniem
 */
public class CountdownWithDelay {
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Start!");
    }
}

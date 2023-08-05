package youcandev.mentoring.java_syntax._09_useful_nuances._05_generating_number;

/*
Generowanie liczby
 */
public class GeneratingNumber {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //napisz tutaj swój kod
        return (int) (Math.random() * 100);
    }
}


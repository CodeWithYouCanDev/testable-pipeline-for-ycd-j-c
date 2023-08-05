package youcandev.mentoring.java_syntax._06_arrays._12_quick_array_filling;

/*
Szybkie wypełnienie tablicy
 */
public class QuickArrayFilling {
    public static String[] array = {"Java", "C++", "C#", "Typescript"};

    public static void main(String[] args) {

        boolean isTaskFinished = false;
        for (int i = 0; i < array.length; i++) {
            if ("Java".equals(array[i])) {
                isTaskFinished = true;
                break;
            }
        }
        System.out.println(isTaskFinished ? "Zadanie zostało wykonane poprawnie" : "Zadanie nie zostało wykonane");
    }
}

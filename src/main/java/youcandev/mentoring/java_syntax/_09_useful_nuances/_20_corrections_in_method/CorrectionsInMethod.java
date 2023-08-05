package youcandev.mentoring.java_syntax._09_useful_nuances._20_corrections_in_method;

/*
Poprawki w metodzie
 */
public class CorrectionsInMethod {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25;  // number becomes 30
        boolean secondCondition = (number | 5) > 12 | (number = number + 2) > 40;  // number remains 30 as right condition is not true
        System.out.println(number);  // This will print 30
    }


}

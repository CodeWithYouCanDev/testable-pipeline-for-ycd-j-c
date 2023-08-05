package youcandev.mentoring.java_syntax._09_useful_nuances._14_issue_with_pause_module;

/*
Problem z modułem przerw
 */
public class IssueWithPauseModule {
    public static void main(String[] args) throws InterruptedException {
        pause(1000L);
        pause(-1000L);
        pause(1234567L);
        pause(-9876543L);
        pause(0L);
    }
    //TODO code change M
    public static void pause(long timeUnits) throws InterruptedException {
        if (timeUnits < 0) {
            timeUnits *= -1;
        }
        while (timeUnits > 999999) {
            timeUnits /= 10;
        }
        Thread.sleep(0, (int) timeUnits);
    }
}

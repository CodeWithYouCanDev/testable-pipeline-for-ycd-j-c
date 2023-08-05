package youcandev.mentoring.java_syntax._09_useful_nuances._13_timer;

import java.util.concurrent.TimeUnit;
//TODO i changed this code M
public class Timer {

    interface Sleeper {
        void sleep(long duration) throws InterruptedException;
    }

    private static final Sleeper REAL_SLEEPER = duration -> TimeUnit.MILLISECONDS.sleep(duration);

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        setTimer(days, hours, minutes, seconds, millis, REAL_SLEEPER);
    }

    // Overloaded method for testing purposes
    static void setTimer(int days, int hours, int minutes, int seconds, int millis, Sleeper sleeper) throws InterruptedException {
        System.out.println("Timer started!");

        sleeper.sleep(TimeUnit.DAYS.toMillis(days));
        sleeper.sleep(TimeUnit.HOURS.toMillis(hours));
        sleeper.sleep(TimeUnit.MINUTES.toMillis(minutes));
        sleeper.sleep(TimeUnit.SECONDS.toMillis(seconds));
        sleeper.sleep(millis);

        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}

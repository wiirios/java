package org.william.timer;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;
import java.util.Timer;

public class TimerClass {
    public static void TimerMethod(int delay, int period) {
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                LocalDateTime DateLocal = LocalDateTime.now(Clock.systemDefaultZone());
                System.out.println(DateLocal.format(DateTimeFormatter.ofPattern("M/d/u \n H:m")));
            }
        };

        timer.scheduleAtFixedRate(timerTask, delay, period);

    }
}

import java.util.*;
import java.lang.*;

public class Time {
    Timer timer = new Timer();
    TimerTask task;
    int seconds = 0;
    Time(int bound) {
        task = new TimerTask() {
            public void run() {
                if (seconds < bound) {
                    seconds++;
                    System.out.println(seconds);
                } else
                    System.exit(1);
            }
        };
    }
    public void start() {
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

}


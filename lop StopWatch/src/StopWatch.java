import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void end() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime(LocalTime startTime, LocalTime endTime ) {
        int miliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return miliSecond;
    }


}

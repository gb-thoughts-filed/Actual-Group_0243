public class Stopwatch extends GameManager{
    private long stopWatchStartTime = 0;
    private long stopWatchStopTime = 0;
    private boolean stopWatchRunning = false;

    public Stopwatch(){
    }

    public boolean isStopWatchRunning(){
        return stopWatchRunning;
    }

    public void start() {
        this.stopWatchStartTime = System.nanoTime();
        this.stopWatchRunning = true;
    }


    public void stop() {
        this.stopWatchStopTime = System.nanoTime();
        this.stopWatchRunning = false;
    }


    public long getElapsedSeconds() {
        long elapsedTime;

        if (stopWatchRunning)
            elapsedTime = (System.nanoTime() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        int nanoSecondsPerSecond = 1000000000;
        return elapsedTime / nanoSecondsPerSecond;
    }


}

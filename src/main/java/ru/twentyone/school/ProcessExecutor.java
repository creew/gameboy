package ru.twentyone.school;

public class ProcessExecutor {

    private final long STEP = 954;

    private final long FORCED_STEP = STEP / 2;
    private long clockCount = 0;

    private boolean run;

    private long startTime;

    private Thread thread;
    public void start() {
        startTime = System.nanoTime();
        clockCount = 0;
        thread = new Thread(this::run);
        thread.start();
        run = true;
    }

    public void stop() {
        run = false;
    }

    public void run() {
        while(run) {
            long l = System.nanoTime();
            if (l - startTime > STEP) {
                startTime = l;
                clockCount++;
            }
        }
    }
}

package ru.twentyone.school;

public class ProcessExecutor {

    private final long STEP = 954;

    private final long FORCED_STEP = STEP / 2;

    public long startTime;

    public void init() {
        startTime = System.nanoTime();
    }

    public void run() {
        while(true) {
            long l = System.nanoTime();
            if (l - startTime > STEP) {


                startTime = l;
            }
        }
    }
}

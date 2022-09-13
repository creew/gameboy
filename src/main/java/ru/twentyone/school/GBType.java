package ru.twentyone.school;

public enum GBType {
    DMG(64 * 1024, 64 * 1024),
    CGB(128 * 1024, 256 * 1024);

    private final int displayRamSize;

    private final int workRamSize;

    GBType(int displayRamSize, int workRamSize) {
        this.displayRamSize = displayRamSize;
        this.workRamSize = workRamSize;
    }

    public int getDisplayRamSize() {
        return displayRamSize;
    }

    public int getWorkRamSize() {
        return workRamSize;
    }
}

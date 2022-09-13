package ru.twentyone.school.cpu;

public enum CpuRegisterDesc {
    A(8, 0b111),
    B(8, 0b000),
    C(8, 0b001),
    D(8, 0b101),
    E(8, 0x011),
    H(8, 0x100),
    L(8, 0x101),
    PC(16, -1),
    SP(16, -1);

    private final int bitSize;

    private final int mask;

    CpuRegisterDesc(int bitSize, int mask) {
        this.bitSize = bitSize;
        this.mask = mask;
    }

    public int getBitSize() {
        return bitSize;
    }

    public int getMask() {
        return mask;
    }
}

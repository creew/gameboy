package ru.twentyone.school.cpu;

public enum FlagsDesc {
    /**
     * флаг установлен (бит равен 1), если результат последней математической операции равен нулю
     * или два операнда оказались равными при сравнении.
     */
    Z(0b10000000),

    /**
     * флаг установлен, если последней операцией было вычитание.
     */
    N(0b01000000),

    /**
     * флаг установлен, если в результате последней математической операции произошел перенос из младшего полу-байта.
     */
    H(0b00100000),

    /**
     * флаг установлен, если в результате последней математической операции произошел перенос.
     */
    C(0b00010000);

    private final int mask;

    FlagsDesc(int mask) {
        this.mask = mask;
    }

    public int getMask() {
        return mask;
    }
}
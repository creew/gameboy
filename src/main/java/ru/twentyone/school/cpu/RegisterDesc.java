package ru.twentyone.school.cpu;

import ru.twentyone.school.GBType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum RegisterDesc {
    P1("P1", 0xFF00, new GBType[]{GBType.DMG, GBType.CGB}),
    SB("SB", 0xFF01, new GBType[]{GBType.DMG, GBType.CGB}),
    SC("SC", 0xFF02, new GBType[]{GBType.DMG, GBType.CGB}),
    DIV("DIV", 0xFF04, new GBType[]{GBType.DMG, GBType.CGB}),
    TIMA("TIMA", 0xFF05, new GBType[]{GBType.DMG, GBType.CGB}),
    TMA("TMA", 0xFF06, new GBType[]{GBType.DMG, GBType.CGB}),
    TAC("TAC", 0xFF07, new GBType[]{GBType.DMG, GBType.CGB}),
    KEY1("KEY1", 0xFF4D, new GBType[]{GBType.CGB}),
    RP("RP", 0xFF6, new GBType[]{GBType.CGB});

    private final String name;

    private final int address;

    private final Set<GBType> types;

    private final int size;

    RegisterDesc(String name, int address, GBType[] types) {
        this.name = name;
        this.address = address;
        this.types = new HashSet<>();
        this.size = 1;
        this.types.addAll(Arrays.asList(types));
    }

    RegisterDesc(String name, int address, int size, GBType[] types) {
        this.name = name;
        this.address = address;
        this.types = new HashSet<>();
        this.size = size;
        this.types.addAll(Arrays.asList(types));
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public Set<GBType> getTypes() {
        return types;
    }

    public int getSize() {
        return size;
    }
}

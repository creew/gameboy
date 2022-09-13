package ru.twentyone.school.cpu;

import ru.twentyone.school.GBType;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractCpu {

    protected Set<RegisterDesc> registers;

    public void init(GBType type) {
        registers = new HashSet<>();
        for (RegisterDesc value : RegisterDesc.values()) {
            if (value.getTypes().contains(type)) {
                registers.add(value);
            }
        }
    }

}

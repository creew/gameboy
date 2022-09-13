package ru.twentyone.school.cpu;

import ru.twentyone.school.GBType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Cpu {

    protected HashMap<RegisterDesc, Integer> registers;
    public void init(GBType type) {
        registers = new HashMap<>();
        for (RegisterDesc value : RegisterDesc.values()) {
            if (value.getTypes().contains(type)) {
                registers.put(value, 0);
            }
        }
    }

    public int getValue(RegisterDesc registerDesc) {
        return registers.get(registerDesc);
    }

}
